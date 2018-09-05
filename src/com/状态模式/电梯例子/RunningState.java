package com.状态模式.电梯例子;

/**
 * @ClassName RunningState
 * @Description 运行状态
 * @Author deus
 * @Data 2018/8/31 11:42
 * @Version 1.0
 **/
public class RunningState extends LiftState {
    @Override
    public void Open() {
        //什么也不做
    }

    @Override
    public void Close() {
        //什么也不做
    }

    @Override
    public void Run() {
        System.out.println("电梯上下运行。。。");
    }

    @Override
    public void Stop() {
        //设置为停止状态
        super.context.setLiftState(Context.stoppingState);
        //委托环境类执行停止动作
        super.context.getLiftState().Stop();
    }
}
