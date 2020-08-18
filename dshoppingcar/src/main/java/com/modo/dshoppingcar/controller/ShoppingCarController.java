package com.modo.dshoppingcar.controller;

import com.modo.dshoppingcar.beans.ResultVo;
import com.modo.dshoppingcar.beans.ShoppingCar;
import com.modo.dshoppingcar.service.ShoppingCarSercive;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author:modoyun
 * @TIME:6:58
 * @DATE:2020/6/19 -rf
 */
@RequestMapping("/shoppingcar")
@RestController
public class ShoppingCarController {
    @Resource
    private ShoppingCarSercive shoppingCarSercive;
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResultVo addShoppingCar(@RequestBody ShoppingCar shoppingCar,@RequestHeader String token) throws Exception {
        //int i = shoppingCarSercive.addShoppingcar(shoppingCar);
        System.out.println("shopping传递：" +  token);
        JwtParser parser = Jwts.parser();
        parser.setSigningKey("yunzhengxing");
        Jws<Claims> claimsJws = parser.parseClaimsJws(token);
        int uid = Integer.parseInt(claimsJws.getBody().getId());
        //
       shoppingCar.setUid(uid);
        System.out.println("前端传递过来的值：" + shoppingCar);

        int i = shoppingCarSercive.addShoppingcar(shoppingCar);
        return new ResultVo(0,"addsuccess",null);
    }


}
