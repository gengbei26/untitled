package com.Proxy代理模式.保护代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName DynamicProxy
 * @Description 动态代理
 * @Author deus
 * @Data 2018/8/27 10:19
 * @Version 1.0
 **/
public class DynamicProxy implements InvocationHandler {
    private OrderApi order = null;
    public OrderApi getProxyInterface(Order order){
        this.order = order;
        OrderApi orderApi = (OrderApi) Proxy.newProxyInstance(
                order.getClass().getClassLoader(),
                order.getClass().getInterfaces(),
                this);
        return orderApi;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        if(method.getName().startsWith("set")){
            if(order.getOrderUser() != null
            && order.getOrderUser().equals(args[1])){
                return method.invoke(order,args);
            }else{
                System.out.println("对不起，" + args[1] + "您无权修改订单中的数据");
            }
        } else{
            return method.invoke(order,args);
        }
        return null;
    }
}
