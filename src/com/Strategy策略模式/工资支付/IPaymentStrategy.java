package com.Strategy策略模式.工资支付;

/**
 * @ClassName IPaymentStrategy
 * @Description 策略接口
 *                此处把上下文对象当作参数传递给策略对象，如果要扩展新的策略实现，
 *                只用扩展上下文就可以了，已有的实现不需要做修改。
 * @Author deus
 * @Data 2018/9/20 16:45
 * @Version 1.0
 **/
public interface IPaymentStrategy {
    //公司给某人真正的支付工资
    //ctx是支付工资的上下文，里面包含算法需要的数据
    void Pay(PaymentContext ctx);
}
