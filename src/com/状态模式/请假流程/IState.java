package com.状态模式.请假流程;

/**
 * @ClassName IState
 * @Description 公共状态接口
 * @Author deus
 * @Data 2018/9/5 15:27
 * @Version 1.0
 **/
public interface IState {
    void doWork(StateMachine context);
}
