package com.状态模式.电梯例子;

/**
 * @ClassName StoppingState
 * @Description 停止状态
 * @Author deus
 * @Data 2018/8/31 11:42
 * @Version 1.0
 **/
public class StoppingState extends LiftState {
    @Override
    public void Open() {
        //设置为开门状态
        super.context.setLiftState(Context.openingState);
        //委托环境类执行开门动作
        super.context.getLiftState().Run();
    }

    @Override
    public void Close() {
        //什么也不做
    }

    @Override
    public void Run() {
        //设置为运行状态
        super.context.setLiftState(Context.runningState);
        //委托环境类执行运行动作
        super.context.getLiftState().Run();
    }

    @Override
    public void Stop() {
        System.out.println("电梯停止了。。。");
    }
}
