package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cheese on 2018/6/22.
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public @ResponseBody String index(){
        return "test1233399025";
    }
}
