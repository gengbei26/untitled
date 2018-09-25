package com.Strategy策略模式.日志记录;

/**
 * @ClassName ILogStrategy
 * @Description 日志记录策略的接口
 * @Author deus
 * @Data 2018/9/25 11:12
 * @Version 1.0
 **/
public interface ILogStrategy {
    //记录日志
    void Log(String msg);
}
