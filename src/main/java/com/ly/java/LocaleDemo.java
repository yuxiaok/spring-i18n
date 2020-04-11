package com.ly.java;


import java.util.Locale;

/**
 * @Description
 * @Date 2020/4/9 15:54
 * @Author 8201
 */
public class LocaleDemo {

    public static void main(String[] args) {
        //获取默认方言，默认方言获取到的是系统语言
        System.out.println(Locale.getDefault());

        //修改系统方言
        Locale.setDefault(Locale.US);
        System.out.println(Locale.getDefault());
    }
}
