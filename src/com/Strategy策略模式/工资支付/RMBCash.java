package com.Strategy策略模式.工资支付;

/**
 * @ClassName RMBCash
 * @Description 人民币现金支付
 * @Author deus
 * @Data 2018/9/20 16:58
 * @Version 1.0
 **/
public class RMBCash implements IPaymentStrategy {
    @Override
    public void Pay(PaymentContext ctx) {
        System.out.println("现在给" + ctx.getUserName() + "，人民币现金支付" + ctx.getMoney() +"元");
    }
}
