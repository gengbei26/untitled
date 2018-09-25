package com.Strategy策略模式.日志记录;

/**
 * @ClassName FileLog
 * @Description 把日志记录到文件
 * @Author deus
 * @Data 2018/9/25 11:15
 * @Version 1.0
 **/
public class FileLog extends LogStrategyTemplate {
    @Override
    public void doLog(String msg) {
        System.out.println("现在把'" + msg + "'记录到，文件中。。");
    }
}
