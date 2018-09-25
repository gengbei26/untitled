package com.Strategy策略模式.日志记录;

/**
 * @ClassName LogClient
 * @Description TODO
 * @Author deus
 * @Data 2018/9/25 11:19
 * @Version 1.0
 **/
public class LogClient {
    public static void main(String[] args) {
        LogContext context = new LogContext();
        context.Log("记录日志");
        context.Log("再次记录日志");
    }
}
