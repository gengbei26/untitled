package com.Observer观察者模式.简单变形;

/**
 * @ClassName TransformClient
 * @Description TODO
 * @Author deus
 * @Data 2018/8/29 17:13
 * @Version 1.0
 **/
public class TransformClient {
    //观察者模式的简单变形使用，按水质级别发送消息给不同的观察者
    //一种方案是目标通知，但观察者按水质级别判断是否做操作
    //另一种方案是在目标里判断，只通知需要通知的观察者
    //一般推荐选择第二种，有利于业务控制和扩展
    public static void main(String[] args) {
        //创建水质主题对象
        WaterQuality subject = new WaterQuality();
        //创建几个观察者
        WatcherObserver watcherOne = new Person();
        watcherOne.setJob("监测人员");
        WatcherObserver watcherTwo = new Person();
        watcherTwo.setJob("预警人员");
        WatcherObserver watcherThree= new Person();
        watcherThree.setJob("监测部门领导");
        //注册观察者
        subject.Attach(watcherOne);
        subject.Attach(watcherTwo);
        subject.Attach(watcherThree);
        //填写水质报告
        System.out.println("当前水质正常的时候------------------");
        subject.setPolluteLevel(0);
        System.out.println("水质轻度污染的时候------------------");
        subject.setPolluteLevel(1);
        System.out.println("水质中度污染的时候------------------");
        subject.setPolluteLevel(2);
    }

}
