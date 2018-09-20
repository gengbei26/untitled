package com.Strategy策略模式.工资支付;

/**
 * @ClassName PaymentContext
 * @Description 支付工资的上下文，每个人的工资不同，支付方式也不同
 * @Author deus
 * @Data 2018/9/20 17:00
 * @Version 1.0
 **/
public class PaymentContext {
    private String userName;
    private double money;
    private IPaymentStrategy strategy;

    public PaymentContext(String userName, double money, IPaymentStrategy strategy) {
        this.userName = userName;
        this.money = money;
        this.strategy = strategy;
    }

    public String getUserName() {
        return this.userName;
    }
    public double getMoney() {
        return this.money;
    }
    public IPaymentStrategy getStrategy() {
        return this.strategy;
    }

    public void PayNow(){
        this.strategy.Pay(this);
    }
}
