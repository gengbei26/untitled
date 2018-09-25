package com.Strategy策略模式.日志记录;

/**
 * @ClassName DbLog
 * @Description 把日志记录到数据库
 * @Author deus
 * @Data 2018/9/25 11:13
 * @Version 1.0
 **/
public class DbLog extends LogStrategyTemplate {
    @Override
    public void doLog(String msg) {
        //制造一个错误
        if (msg != null && msg.trim().length() > 5) {
            int a = 5 / 0;
        }
        System.out.println("现在把'" + msg +"'记录到数据库中" );
    }
}
