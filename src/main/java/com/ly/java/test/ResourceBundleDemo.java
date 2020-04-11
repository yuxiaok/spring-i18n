package com.ly.java.test;

import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @Description java原生
 * @Date 2020/4/8 19:13
 * @Author 8201
 */
public class ResourceBundleDemo {
    //Resource Bundle所在位置
    private static final String BUNDLE_NAME = "i18n/language";

    public static void main(String[] args) {
        getEn();
        getCn();
    }

    private static void getEn() {
        Locale.setDefault(Locale.US);
        ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME);
        String format = MessageFormat.format(bundle.getString("args"), new Object[]{"world"});
        System.out.println(format);
    }

    private static void getCn() {
        Locale.setDefault(Locale.SIMPLIFIED_CHINESE);
        ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME);
        //因为properties文件，默认编码是ISO 8895-1,这里如果不进行编码转换，则会出现中文乱码
        String name = bundle.getString("name");
        System.out.println(name);
//
//        String format = MessageFormat.format(new String(bundle.getString("args").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8), new Object[]{"世界"});
//        System.out.println(format);
    }
}
