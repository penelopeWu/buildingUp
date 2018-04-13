package com.penelopenest.buildingup.web;

import com.penelopenest.buildingup.exceptions.MyException;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author penelopeWu
 * @date 2018-04-12 9:45
 * @version  0.0.1-SNAPSHOT
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "Hello Spring Boot";
    }

    @RequestMapping("/e")
    public String exp ()throws Exception{
        throw new Exception("故意出错");
    }

    @RequestMapping("/json")
    public String json() throws Exception{
        throw new MyException("自定义异常捕获，返回json错误信息");
    }


}
