package com.ly.java;

import java.text.MessageFormat;

/**
 * @Description 格式化消息
 * @Date 2020/4/8 19:08
 * @Author 8201
 */
public class MessageFormatDemo {
    public static void main(String[] args) {
        MessageFormat messageFormat = new MessageFormat("hello,{0}");
        System.out.println(messageFormat.format(new Object[]{"world"}));
    }
}
