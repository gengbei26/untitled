package com.状态模式.电梯例子;

/**
 * @ClassName OpeningState
 * @Description 开门状态
 * @Author deus
 * @Data 2018/8/31 11:32
 * @Version 1.0
 **/
public class OpeningState extends LiftState {
    @Override
    public void Open() {
        System.out.println("电梯门开启");
    }

    @Override
    public void Close() {
        //设置为关门状态
        super.context.setLiftState(Context.closingState);
        //委托环境类执行关门动作
        super.context.getLiftState().Close();
    }

    @Override
    public void Run() {
        //什么也不做
    }

    @Override
    public void Stop() {
        //什么也不做
    }
}
