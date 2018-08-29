package com.Observer观察者模式.简单变形;

import java.util.ArrayList;

/**
 * @ClassName WaterQualitySubject
 * @Description 定义水质监测的目标对象
 * @Author deus
 * @Data 2018/8/29 16:00
 * @Version 1.0
 **/
public abstract class WaterQualitySubject {
    /**
     * @Author deus
     * @Description 注册的观察者集合
     * @Date 2018/8/29 16:26
     */
    protected ArrayList<WatcherObserver> observers = new ArrayList<>();
    /**
     * @Author deus
     * @Description 注册观察者对象
     * @Date 2018/8/29 16:21
     */
    public void Attach(WatcherObserver observer){
        this.observers.add(observer);
    }
    /**
     * @Author deus
     * @Description 删除观察者对象
     * @Date 2018/8/29 16:25
     */
    public void Detach(WatcherObserver observer){
        this.observers.remove(observer);
    }
    /**
     * @Author deus
     * @Description 通知相应的观察者
     * @Date 2018/8/29 16:26
     */
    public abstract void notifyWatchers();
    /**
     * @Author deus
     * @Description 获取水质污染级别
     * @Date 2018/8/29 16:27
     */
    public abstract int getPolluteLevel();
}
