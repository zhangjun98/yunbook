package com.modo.shoppinglistserver.controller;

import com.modo.shoppinglistserver.beans.ResultVo;
import com.modo.shoppinglistserver.beans.ShoppingCar;
import com.modo.shoppinglistserver.service.ShoppinglistService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:modoyun
 * @TIME:19:25
 * @DATE:2020/6/20 -rf
 */
@RestController
@RequestMapping("/shoping")
public class ShoppinglistController {
    @Resource
    private ShoppinglistService shoppinglistService;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResultVo getshoppinglist(@RequestHeader String token) throws Exception {
        JwtParser parser = Jwts.parser();
        parser.setSigningKey("yunzhengxing");
        Jws<Claims> claimsJws = parser.parseClaimsJws(token);
        int uid = Integer.parseInt(claimsJws.getBody().getId());
        List<ShoppingCar> shoppingByUid = shoppinglistService.getShoppingByUid(uid);
        return new ResultVo(0,"success",shoppingByUid);
    }
    @RequestMapping(value = "/arr",method = RequestMethod.GET)
    public ResultVo getShoppingone(@RequestParam("msg") String msg) throws Exception {
        System.out.println("前端传：" + msg);
        String[] split = msg.split("!");
        System.out.println("前端传递过来的值：" + split);
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
            int i1 = Integer.parseInt(split[i]);
           integers.add(i1);
        }
        System.out.println("完成转换=====");
        Integer[] integers1 = (Integer[]) integers.toArray();
      /*  for (int i = 0; i < ; i++) {

        }*/
        Integer[] arr = {2};
        List<ShoppingCar> shoppingBySid = shoppinglistService.getShoppingBySid(arr);
        return new ResultVo(0,"getsuccess",shoppingBySid);
    }
}
