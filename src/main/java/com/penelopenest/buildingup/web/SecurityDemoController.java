package com.penelopenest.buildingup.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author penelopeWu
 * @version 1.0
 * @date 2018-04-13 12:46
 */
@Controller
@RequestMapping(value = "/safe")
public class SecurityDemoController {

    @RequestMapping("/")
    public String index() {
        return "safeIndex";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "safeHello";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

}
