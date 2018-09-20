package com.Strategy策略模式.工资支付;

/**
 * @ClassName DollarCash
 * @Description 美员现金支付
 * @Author deus
 * @Data 2018/9/20 17:05
 * @Version 1.0
 **/
public class DollarCash implements IPaymentStrategy {
    @Override
    public void Pay(PaymentContext ctx) {
        System.out.println("现在给" + ctx.getUserName() + "，美员现金支付" + ctx.getMoney() +"元");
    }
}
