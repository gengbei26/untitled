package com.Strategy策略模式.工资支付;

/**
 * @ClassName PayClient
 * @Description TODO
 * @Author deus
 * @Data 2018/9/20 17:07
 * @Version 1.0
 **/
public class PayClient {
    public static void main(String[] args) {
        //创建支付策略
        IPaymentStrategy strategyRMB = new RMBCash();
        IPaymentStrategy strategyDollar = new DollarCash();
        IPaymentStrategy strategyCard = new Card();

        //配置上下文
        PaymentContext ctxOne = new PaymentContext("小李子",5000,strategyRMB);
        PaymentContext ctxTwo = new PaymentContext("张同学", 8000, strategyDollar);
        PaymentContext2 ctxCard = new PaymentContext2("那个谁",20000,strategyCard,"ISN123456");

        //支付工资
        ctxOne.PayNow();
        ctxTwo.PayNow();
        ctxCard.PayNow();
    }
}
