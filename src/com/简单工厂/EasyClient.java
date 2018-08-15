package com.简单工厂;

/**
 * @ClassName EasyClient
 * @Description TODO
 * @Author deus
 * @Data 2018/8/14 17:10
 * @Version 1.0
 **/
public class EasyClient {
    public static void main(String[] args) {
        //Api api = Factory.CreateApi(1);
        Api api = Factory.CreateApi();
        api.operation("正在使用简单工厂");
    }
}
