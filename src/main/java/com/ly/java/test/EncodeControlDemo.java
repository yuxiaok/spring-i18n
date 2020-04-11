package com.ly.java.test;

import com.ly.java.control.EncodeControl;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @Description
 * @Date 2020/4/9 20:37
 * @Author 8201
 */
public class EncodeControlDemo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.SIMPLIFIED_CHINESE);
        //显式的指定我们使用的Control
        ResourceBundle bundle = ResourceBundle.getBundle("i18n/language", new EncodeControl("UTF-8"));
        System.out.println(bundle.getString("name"));
    }
}
