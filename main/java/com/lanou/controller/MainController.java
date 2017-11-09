package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zar on 2017/11/2.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/")
    public String home() {
        return "home";
    }
}
