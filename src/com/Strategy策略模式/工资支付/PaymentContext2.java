package com.Strategy策略模式.工资支付;

/**
 * @ClassName PaymentContext2
 * @Description TODO
 * @Author deus
 * @Data 2018/9/20 17:14
 * @Version 1.0
 **/
public class PaymentContext2 extends PaymentContext {
    //银行帐号
    private String account;

    public String getAccount() {
        return this.account;
    }

    //构造方法，传入被支付工资的人员，应支付的金额和具体的支付策略
    public PaymentContext2(String userName, double money, IPaymentStrategy strategy, String account) {
        super(userName, money, strategy);
        this.account = account;
    }
}
