package com.ly.java;

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
    private static final String BUNDLE_NAME="language";

    public static void main(String[] args) {
        getEn();
        getCn();
    }
    private static void getEn(){
        Locale.setDefault(Locale.US);
        ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME);
        String format = MessageFormat.format(bundle.getString("args"), new Object[]{"world"});
        System.out.println(format);
    }
    private static void getCn(){
        Locale.setDefault(Locale.SIMPLIFIED_CHINESE);
        ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME);
        String format = new String(MessageFormat.format(bundle.getString("args"), new Object[]{"世界"}).getBytes(StandardCharsets.ISO_8859_1),StandardCharsets.UTF_8);
        System.out.println(format);
    }
}
