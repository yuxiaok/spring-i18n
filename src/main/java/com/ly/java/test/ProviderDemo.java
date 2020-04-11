package com.ly.java.test;

import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.ServiceLoader;
import java.util.spi.ResourceBundleControlProvider;

/**
 * @Description
 * @Date 2020/4/11 11:27
 * @Author 8201
 */
public class ProviderDemo {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("i18n/language");
        System.out.println(bundle.getString("name"));

//        ServiceLoader<ResourceBundleControlProvider> threadContextClassLoader = ServiceLoader.load(ResourceBundleControlProvider.class);
//        Iterator<ResourceBundleControlProvider> providerIterator = threadContextClassLoader.iterator();
//        System.out.println("-----------------线程上下文类加载器------------------");
//        while (providerIterator.hasNext()) {
//            System.out.println(providerIterator.next().toString());
//        }
//        ServiceLoader<ResourceBundleControlProvider> extensionClassLoader = ServiceLoader.loadInstalled(ResourceBundleControlProvider.class);
//        Iterator<ResourceBundleControlProvider> iterator = extensionClassLoader.iterator();
//        System.out.println("-----------------扩展类加载器------------------------");
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next().toString());
//        }
    }
}
