package com.状态模式.电梯例子;

/**
 * @ClassName Context
 * @Description 环境对象
 * @Author deus
 * @Data 2018/8/31 10:50
 * @Version 1.0
 **/
public class Context {
    //定义出所有的电梯状态
    public final static OpeningState openingState = new OpeningState();
    public final static ClosingState closingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();

    //定义一个当前电梯状态
    private LiftState liftState;
    public LiftState getLiftState() {
        return this.liftState;
    }

    public void setLiftState(LiftState _liftState) {
        this.liftState = _liftState;
        //把当前的环境通知到各个实现类中
        this.liftState.setContext(this);
    }
    public void contextOpen(){
        this.liftState.Open();
    }
    public void contextClose(){
        this.liftState.Close();
    }
    public void contextRun(){
        this.liftState.Run();
    }
    public void contextStop(){
        this.liftState.Stop();
    }
}
