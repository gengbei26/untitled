package com.Proxy代理模式.保护代理;

/**
 * @ClassName ProxyClient
 * @Description TODO
 * @Author deus
 * @Data 2018/8/24 17:25
 * @Version 1.0
 **/
public class ProxyClient {
    public static void main(String[] args) {
        //保护代理
//        OrderApi orderApi = new OrderProxy(new Order(
//                "设计模式",
//                100,
//                "张三"));
        //////////////////////////////////////////////

        //动态代理
        Order order = new Order(
                "设计模式",
                100,
                "张三");
        DynamicProxy dynamicProxy = new DynamicProxy();
        OrderApi orderApi = dynamicProxy.getProxyInterface(order);
        ////////////////////////////////////////////////////////////

        //测试
        orderApi.setOrderNum(333, "李四");
        System.out.println("李四修改后，没有变化：" + orderApi.getOrderNum());
        orderApi.setOrderNum(555, "张三");
        System.out.println("张三修改后，变化了：" + orderApi.getOrderNum());


    }
}
