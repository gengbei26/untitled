package com.状态模式.电梯例子;

/**
 * @ClassName LiftClient
 * @Description TODO
 * @Author deus
 * @Data 2018/8/31 13:47
 * @Version 1.0
 **/
public class LiftClient {
    public static void main(String[] args) {
        Context context = new Context();
        //设置电榜初始状态为关闭
        context.setLiftState(new ClosingState());
        context.contextOpen();
        context.contextClose();
        context.contextRun();
        context.contextStop();
    }
}
