package com.ly.spi.impl;

import com.ly.spi.Zoo;

/**
 * @Description
 * @Date 2020/4/10 17:46
 * @Author 8201
 */
public class Cat implements Zoo {
    @Override
    public void spi() {
        System.out.println("cat");
    }
}
