package com.Strategy策略模式.价格打折;

/**
 * @ClassName StrategyClien
 * @Description 策略模式
 * @Author deus
 * @Data 2018/9/20 16:01
 * @Version 1.0
 **/
public class StrategyClient {
    public static void main(String[] args) {
        //1.选择并创建需要使用的策略对象
        IStrategy strategy = new LargeCustomerStategy();

        //2.创建上下文对象
        Price ctx = new Price(strategy);

        //3.计算报价
        double quote_L = ctx.Quote(1000);
        System.out.println("向客户报价：" + quote_L);

        //向老客户报价
        strategy = new OldCustomerStrategy();
        ctx = new Price(strategy);
        double quote_O = ctx.Quote(1000);
        System.out.println("向客户报价：" + quote_O);

        //向普通客户报价
        strategy = new NormalCustomerStrategy();
        ctx = new Price(strategy);
        double quote_N = ctx.Quote(1000);
        System.out.println("向客户报价：" + quote_N);
    }
}
