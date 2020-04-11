package com.ly.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description
 * @Date 2020/4/8 16:23
 * @Author 8201
 */
@Controller
public class InternationalController {


    /**
     * 通过拦截器，根据Locale，改变返回的信息
     *
     * @param language
     * @return
     */
    @GetMapping("/international")
    public String international(String language) {
        System.out.println(language);
        return "international";
    }


    @GetMapping("/request")
    public String request(){
        return "international";
    }
    /**
     * 通过请求直接更改整个应用的返回视图
     *
     * @param paramName
     * @param request
     * @param response
     */
    @GetMapping("/request/international")
    public String requestInternational(String paramName, HttpServletRequest request, HttpServletResponse response) {
        LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
        if (localeResolver == null) {
            throw new RuntimeException("No LocaleResolver found: not in a DispatcherServlet request?");
        }
        localeResolver.setLocale(request, response, StringUtils.parseLocaleString(paramName));
        return "international";
    }
}
