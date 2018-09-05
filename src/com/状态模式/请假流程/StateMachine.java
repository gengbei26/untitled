package com.状态模式.请假流程;

/**
 * @ClassName StateMachine
 * @Description 公共状态处理机，相当于状态模式中的环境对象Context
 *               包含所有流程使用状态模式时的公共功能
 * @Author deus
 * @Data 2018/9/5 15:23
 * @Version 1.0
 **/
public abstract class StateMachine {
    //持有一个状态对象
    private IState state = null;
    //流程处理需要的业务数据，将传递到具体的状态对象中
    private Object businessVO = null;

    //执行工作，客户端处理流程的接口方法
    //在客户完成自己的业务工作后调用
    public void doWork(){
        //转调相应的状态对象真正完成功能处理
        this.state.doWork(this);
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public Object getBusinessVO() {
        return businessVO;
    }

    public void setBusinessVO(Object businessVO) {
        this.businessVO = businessVO;
    }
}
