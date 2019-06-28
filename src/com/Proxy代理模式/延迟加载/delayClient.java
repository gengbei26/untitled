package com.Proxy代理模式.延迟加载;

/**
 * @ClassName delayClient
 * @Description TODO
 * @Author deus
 * @Data 2019/6/27 17:48
 * @Version 1.0
 **/
public class delayClient {
    public static void main(String[] args) {
        IDBQuery iq = new DBQueryProxy();
        System.out.println("初始化DBQueryProxy");
        ///////////////////////////////////
        System.out.println("开始执行DBQuery");
        String res = iq.request();
        System.out.println(res);
    }
}
