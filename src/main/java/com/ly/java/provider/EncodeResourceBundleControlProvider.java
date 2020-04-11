package com.ly.java.provider;

import com.ly.java.control.EncodeControl;

import java.util.ResourceBundle;
import java.util.spi.ResourceBundleControlProvider;

/**
 * @Description 基于SPI机制
 * @Date 2020/4/11 11:25
 * @Author 8201
 */
public class EncodeResourceBundleControlProvider implements ResourceBundleControlProvider {
    @Override
    public ResourceBundle.Control getControl(String baseName) {
        //返回我们自己的Control
        return new EncodeControl("utf-8");
    }
}
