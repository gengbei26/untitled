package com.状态模式.电梯例子;

/**
 * @ClassName LiftState
 * @Description 抽象电梯的各个状态
 * @Author deus
 * @Data 2018/8/31 10:49
 * @Version 1.0
 **/
public abstract class LiftState {
    //定义一个环境角色，也就是封装状态的变化引起的功能变化
    protected Context context;

    public void setContext(Context _context){
        this.context = _context;
    }
    //定义电梯各种抽象动作
    public abstract void Open();
    public abstract void Close();
    public abstract void Run();
    public abstract void Stop();
}
