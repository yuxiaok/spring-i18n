package com.ly.spi.test;

import com.ly.spi.Zoo;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Description SPI是可以跨jar的
 * @Date 2020/4/10 17:48
 * @Author 8201
 * SPI=面向接口编程+策略模式+配置文件
 * 优点：
 * 1.解耦，使得调用者和服务提供者的具体实现进行解耦，根据具体需求调用具体的实现
 * 2.相比使用提供接口jar包，供第三方模块实现接口的方式，SPI的方式使得源框架，不必关心接口的实现类的路径
 * 3.通过SPI的方式，第三方服务模块实现接口后，在第三方的项目的代码的META-INF/services目录下的配置文件指定实现类的全路径名，源码框架即可找到实现类
 * 4.例如com.mysql.jdbc.Driver就是使用SPI机制实现的，各个厂商实现java.sql.Driver接口，并把自己的实现通过SPI机制进行注册
 * 缺点：
 * 1.基本只能通过遍历全部获取，也就是接口的实现类全部加载并实例化一遍，如果你并不想用某些实现类，它也被加载并实例化了，这就造成了浪费
 * 2.获取某个实现类的方式不够灵活，只能通过Iterator形式获取，不能根据某个参数获取对应的实现类
 */
public class TestSPI {

    public static void main(String[] args) {
        //使用线程的上下文类加载器
        //load的时候实例化了一个ServiceLoader，
        // 主要包括几个属性：service:接口或实现类，loader:类加载器，acc:访问权限控制，providers:缓存已经加载的实例，lookupIterator:懒加载迭代器
        ServiceLoader<Zoo> serviceLoader = ServiceLoader.load(Zoo.class);
        //获取迭代器
        Iterator<Zoo> iterator = serviceLoader.iterator();
        //判断是否还有要加载的实例
        //1.根据缓存判断
        //2.如果缓存中没有，根据META-INF/services/接口或实例的全限定名，加载配置文件，判断是否还有要加载的实例
        while (iterator.hasNext()){
            //获取实例
            //1.从缓存中获取
            //2.缓存中没有，通过Class.forName("全限定名")拿到字节码文件，并通过instance()方法获取实例，并放到缓存中
            iterator.next().spi();
        }
        for (Zoo z :
                serviceLoader) {
            z.spi();
        }

        //使用扩展类加载器
        ServiceLoader<Zoo> loadInstalled = ServiceLoader.loadInstalled(Zoo.class);
        Iterator<Zoo> iterator1 = loadInstalled.iterator();
        while (iterator1.hasNext()){
            iterator1.next().spi();
        }
    }
}
