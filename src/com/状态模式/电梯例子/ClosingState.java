package com.状态模式.电梯例子;

/**
 * @ClassName ClosingState
 * @Description 关门状态
 * @Author deus
 * @Data 2018/8/31 11:39
 * @Version 1.0
 **/
public class ClosingState extends LiftState {
    @Override
    public void Open() {
        //设置为开门状态
        super.context.setLiftState(Context.openingState);
        //执行开门的动作
        super.context.getLiftState().Open();
    }

    @Override
    public void Close() {
        System.out.println("电梯门关闭。。。");
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
        //设置为停止状态
        super.context.setLiftState(Context.stoppingState);
        //委托环境类执行停止动作
        super.context.getLiftState().Stop();
    }
}
