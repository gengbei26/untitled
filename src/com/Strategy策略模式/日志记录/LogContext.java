package com.Strategy策略模式.日志记录;

/**
 * @ClassName LogContext
 * @Description 日志记录的上下文
 * @Author deus
 * @Data 2018/9/25 11:16
 * @Version 1.0
 **/
public class LogContext {
    public void Log(String msg){
        ILogStrategy strategy = new DbLog();
        try{
            strategy.Log(msg);
        }catch(Exception ex){
            strategy = new FileLog();
            strategy.Log(msg);
        }
    }
}
