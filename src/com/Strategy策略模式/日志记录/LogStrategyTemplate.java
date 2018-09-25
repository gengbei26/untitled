package com.Strategy策略模式.日志记录;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @ClassName LogStrategyTemplate
 * @Description 实现日志策略的抽象模板，实现为消息添加时间
 * @Author deus
 * @Data 2018/9/25 15:21
 * @Version 1.0
 **/
public abstract class LogStrategyTemplate implements ILogStrategy {
    @Override
    public final void Log(String msg) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        msg = df.format(new java.util.Date()) + "内容是：" + msg;
        doLog(msg);
    }
    protected abstract void doLog(String msg);
}
