package com.Strategy策略模式.价格打折;

/**
 * @ClassName IStrategy
 * @Description 策略接口
 *                此处所有策略都实现了同一个策略接口，传入同一个上下文，
 *                可能会造成传入的上下文数据的浪费，因为有的算法会使用这些数据，而有的算法不会使用，
 *                但是上下文和策略对象之间交互的开销是存在的。
 *                就算把所有可能的参数都定义出来，未来有新的参数时，就要修改所有的实现，扩展性很差。
 * @Author deus
 * @Data 2018/9/20 15:43
 * @Version 1.0
 **/
public interface IStrategy {
    //计算应报的价格
    //传入商品销售原价
    //返回计算后，应该给客户的价格
    double calcPrice(double goodsPrice);
}
