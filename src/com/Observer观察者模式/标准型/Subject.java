package com.Observer观察者模式.标准型;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Subject
 * @Description 目标对象，例子中是普通的类，
 *                此处为了通用写成抽象类
 * @Author deus
 * @Data 2018/8/29 9:21
 * @Version 1.0
 **/
public abstract class Subject {
    //注册的观察者集合
    private List<Observer> observers = new ArrayList<>();
    //注册观察者对象
    public void attach(Observer observer){
        this.observers.add(observer);
    }
    //删除观察者对象
    public void detach(Observer observer){
        this.observers.remove(observer);
    }
    //通知所有注册的观察者对象
    protected void notifyObservers(){
        for(Observer observer : this.observers){
            observer.update(this);
        }
    }
}
