package com.简单工厂;

/**
 * @ClassName ImplB
 * @Description 简单工厂不是一个标准的设计模式
 * @Author deus
 * @Data 2018/8/14 16:53
 * @Version 1.0
 **/
public class ImplB implements Api {
    public void operation(String s) {
        System.out.println("ImplB s:" + s);
    }
}
