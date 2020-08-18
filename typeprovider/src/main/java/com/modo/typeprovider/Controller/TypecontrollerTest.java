package com.modo.typeprovider.Controller;
import com.modo.typeprovider.beans.ResultVo;
import com.modo.typeprovider.beans.ResultVo2;
import com.modo.typeprovider.beans.Type;
import com.modo.typeprovider.service.Typeservice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:modoyun
 * @TIME:20:10
 * @DATE:2020/6/16 -rf
 * type测试
 */
@RestController
@CrossOrigin
@RequestMapping("/type")
public class TypecontrollerTest {
    @Resource
    private Typeservice typeservice;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResultVo2 typetest() throws Exception {
        System.out.println("进入----");
        List<Type> all = typeservice.getAll();
        System.out.println("得到的数据" + all);
       return new ResultVo2(0,"success",all);
    }

    @RequestMapping(value = "/testa",method = RequestMethod.GET)
    public String typetest3() throws Exception {
        System.out.println("test3333-----");
        return "Stringtest";

    }
}
