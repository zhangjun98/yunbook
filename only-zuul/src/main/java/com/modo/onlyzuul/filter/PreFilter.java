package com.modo.onlyzuul.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.modo.onlyzuul.bean.ResultVo;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import lombok.SneakyThrows;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:modoyun
 * @TIME:14:00
 * @DATE:2020/6/19 -rf
 */
@Component
public class PreFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @SneakyThrows
    @Override
    public Object run() throws ZuulException {

       /* RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String token = request.getHeader("token");
        System.out.println("受限资源:" + token);
        if (token != null && !"".equals(token)) {
            //校验token

                System.out.println("zuul进入校验");
                JwtParser parser = Jwts.parser();
                parser.setSigningKey("yunzhengxing");

                //解析token，只要不抛出异常表示token正常
                Jws<Claims> claimsJws = parser.parseClaimsJws(token);
                //从token中获取信息
                Claims body = claimsJws.getBody();
                String subject = body.getSubject();
                String id = body.getId();
                // 返回前端一个状态
                Map vo = new HashMap();
                vo.put("code",2);
                vo.put("msg","token is errer");
                ctx.getResponse().getWriter().write(new ObjectMapper().writeValueAsString(vo));
                return true;

        }*/

        try {
            RequestContext context = RequestContext.getCurrentContext();
            HttpServletRequest request = context.getRequest();
            String token = request.getHeader("token");
            System.out.println("受限资源:" + token);

            if (!"options".equalsIgnoreCase(request.getMethod())) {

                if (token == null) {
                    //拦截用户请求

                    context.setSendZuulResponse(false); //设置response不用于zuul响应
                    context.setResponseStatusCode(401);
                    context.getResponse().getWriter().write("Token is empty..");

                } else {
                    //JWT校验token的正确性
                        try {
                            System.out.println("zuul进入校验");
                            JwtParser parser = Jwts.parser();
                            parser.setSigningKey("yunzhengxing");

                            //解析token，只要不抛出异常表示token正常
                            Jws<Claims> claimsJws = parser.parseClaimsJws(token);
                            //从token中获取信息
                            Claims body = claimsJws.getBody();
                            String subject = body.getSubject();
                        }catch (Exception e){
                            context.setResponseStatusCode(401);
                            Map vo = new HashMap();
                            vo.put("code",2);
                            vo.put("msg","token is errer");
                            context.getResponse().getWriter().write(new ObjectMapper().writeValueAsString(vo));
                        }



                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
