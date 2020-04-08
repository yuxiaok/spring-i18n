package com.ly.java;

import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Locale;

/**
 * @Description spring
 * @Date 2020/4/8 20:15
 * @Author 8201
 */
public class ReloadableResourceBundleMessageSourceDemo {

    public static void main(String[] args) {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("language");
        System.out.println(messageSource.getMessage("args",new Object[]{"world"}, Locale.US));
    }
}
