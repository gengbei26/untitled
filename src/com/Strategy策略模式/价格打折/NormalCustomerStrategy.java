package com.Strategy策略模式.价格打折;

/**
 * @ClassName NormalCustomerStrategy
 * @Description 普通用户的具体算法实现
 * @Author deus
 * @Data 2018/9/20 15:52
 * @Version 1.0
 **/
public class NormalCustomerStrategy implements IStrategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("新客户或者是普通客户，没有折扣");
        return goodsPrice;
    }
}
