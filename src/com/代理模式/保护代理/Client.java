package com.代理模式.保护代理;

/**
 * @ClassName Client
 * @Description TODO
 * @Author deus
 * @Data 2018/8/24 17:25
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        OrderApi order = new OrderProxy(new Order(
                "设计模式",
                100,
                "张三"));
        order.setOrderNum(333,"李四");
        System.out.println("李四修改后，没有变化：" + order.getOrderNum());
        order.setOrderNum(555,"张三");
        System.out.println("张三修改后，变化了：" + order.getOrderNum());
    }
}
