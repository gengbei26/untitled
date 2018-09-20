package com.Strategy策略模式.工资支付;

/**
 * @ClassName Card
 * @Description 支付银行卡
 * @Author deus
 * @Data 2018/9/20 17:22
 * @Version 1.0
 **/
public class Card implements IPaymentStrategy {
    @Override
    public void Pay(PaymentContext ctx) {
        //这个新的算法自己知道是使用扩展的支付上下文，所以强制转换一下，否则无法调用getAccount()方法
        PaymentContext2 ctx2 = (PaymentContext2)ctx;
        System.out.println("现在给" + ctx2.getUserName() + "的帐号："+ctx2.getAccount()+"，支付了" + ctx2.getMoney() +"元");
    }
}
