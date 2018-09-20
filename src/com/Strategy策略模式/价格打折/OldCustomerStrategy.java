package com.Strategy策略模式.价格打折;

/**
 * @ClassName OldCustomerStrategy
 * @Description 老客户的具体算法实现
 * @Author deus
 * @Data 2018/9/20 15:54
 * @Version 1.0
 **/
public class OldCustomerStrategy implements IStrategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("老客户，统一折扣5%");
        return goodsPrice * (1 - 0.05);
    }
}
