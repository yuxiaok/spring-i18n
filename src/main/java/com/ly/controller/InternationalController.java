package com.ly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description
 * @Date 2020/4/8 16:23
 * @Author 8201
 */
@Controller
public class InternationalController {


    /**
     * 通过拦截器，根据请求切换语言
     *
     * @param language
     * @return
     */
    @GetMapping("/international")
    public String international(String language) {
        System.out.println(language);
        return "international";
    }
}
