package com.penelopenest.buildingup.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author penelopeWu
 * @version 1.0
 * @date 2018-04-12 22:06
 */
@Controller
public class ThymeleafController {

    @RequestMapping(value = "/thymeleaf")
    public String index(ModelMap modelMap) {
        //加入一个属性，用于在模板中读取
        modelMap.addAttribute("host", "https://github.com/penelopeWu");
        //返回模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }
}
