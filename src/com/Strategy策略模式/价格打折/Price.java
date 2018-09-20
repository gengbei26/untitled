package com.Strategy策略模式.价格打折;

/**
 * @ClassName Price
 * @Description 价格管理，主要完成计算向客户报价的功能
 *                此处是策略模式中的上下文对象
 * @Author deus
 * @Data 2018/9/20 15:57
 * @Version 1.0
 **/
public class Price {
    //持有一个具体的策略对象
    private IStrategy strategy;

    //构造函数，传入一个具体的策略对象
    public Price(IStrategy strategy) {
        this.strategy = strategy;
    }

    //报价，计算对客户的报价
    public double Quote(double goodsPrice){
        return this.strategy.calcPrice(goodsPrice);
    }
}
