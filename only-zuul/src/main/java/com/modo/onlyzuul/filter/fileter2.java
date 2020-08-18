package com.modo.onlyzuul.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:modoyun
 * @TIME:0:57
 * @DATE:2020/6/20 -rf
 */
@Component
public class fileter2  extends ZuulFilter {
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
        RequestContext ctx = RequestContext.getCurrentContext();

        if(!ctx.sendZuulResponse()) {
            return false;
        }
            return true;
    }

    @SneakyThrows
    @Override
    public Object run() throws ZuulException {
        try {
            RequestContext context = RequestContext.getCurrentContext();
            HttpServletRequest request = context.getRequest();
            String token = request.getHeader("token");
            System.out.println("fileter2受限资源:" + token);
            // 4) 判断
            if(token == null|| "".equals(token)){
                // 没有token，登录校验失败，拦截
                System.out.println("空的token");
                context.setSendZuulResponse(false); //设置response不用于zuul响应
              /*  context.setResponseStatusCode(401);*/
                Map vo = new HashMap();
                vo.put("code",2);
                vo.put("msg","token is empty");
                ObjectMapper objectMapper = new ObjectMapper();
                context.getResponse().getWriter().write(objectMapper.writeValueAsString(vo));

            }else {
                try {
                    System.out.println("zuulfileter进入校验");
                    JwtParser parser = Jwts.parser();
                    parser.setSigningKey("yunzhengxing");

                    //解析token，只要不抛出异常表示token正常
                    Jws<Claims> claimsJws = parser.parseClaimsJws(token);
                    //从token中获取信息
                    Claims body = claimsJws.getBody();
                    String subject = body.getSubject();
                }catch (Exception e){
                    context.setSendZuulResponse(false); //设置response不用于zuul响应
                 /*   context.setResponseStatusCode(401);*/
                    Map vo = new HashMap();
                    vo.put("code",2);
                    vo.put("msg","token is errer");

                    context.getResponse().getWriter().write(new ObjectMapper().writeValueAsString(vo));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        return null;
    }
}
