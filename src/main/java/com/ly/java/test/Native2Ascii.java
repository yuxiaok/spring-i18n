package com.ly.java.test;

import java.util.ResourceBundle;

/**
 * @Description
 * @Date 2020/4/11 14:34
 * @Author 8201
 */
public class Native2Ascii {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("i18n/language");
        System.out.println(bundle.getString("name"));
    }
}
