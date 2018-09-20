package com.Strategy策略模式.价格打折;

/**
 * @ClassName LargeCustomerStategy
 * @Description 大客户的具体算法实现
 * @Author deus
 * @Data 2018/9/20 15:55
 * @Version 1.0
 **/
public class LargeCustomerStategy implements IStrategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("大客户，折扣是10%");
        return goodsPrice * (1 - 0.1);
    }
}
