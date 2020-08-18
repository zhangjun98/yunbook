package com.modo.userloginservice.controller;

import com.modo.userloginservice.bean.ResultVo;
import com.modo.userloginservice.bean.User;
import com.modo.userloginservice.service.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Author:modoyun
 * @TIME:11:39
 * @DATE:2020/6/19 -rf
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class LoginController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ResultVo tologin(@RequestParam("username") String username,@RequestParam("password") String password) throws Exception {
        // 当用户来了进行验证。
        // service
        System.out.println("传递过来的值：" + username + "---"+ password);
        User user = userService.checkLogin(username, password);
        String token = "tokkkk";

        if (user.getUsername().equals(username) && user.getPassword().equals(password)){
            // 给个token返回
            System.out.println("进入验证：返回token");
            token = Jwts.builder()
                    .setSubject(username)     //设置用户信息
                    .setId(user.getUid()+"")             //设置用ID
                    .setIssuedAt(new Date())            //设置token的创建时间
                    .setExpiration(new Date(System.currentTimeMillis()+30*60*1000))  //设置过期时间
                    .signWith(SignatureAlgorithm.HS256,"yunzhengxing")  //加密方式及key
                    .compact();

        }
        return new ResultVo(0,"success",token);
    }
}
