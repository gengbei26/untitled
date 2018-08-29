package com.Observer观察者模式.简单变形;

/**
 * @ClassName Person
 * @Description 具体的观察者实现
 * @Author deus
 * @Data 2018/8/29 16:41
 * @Version 1.0
 **/
public class Person implements WatcherObserver {
    /**
     * @Author deus
     * @Description 人员的职务
     * @Date 2018/8/29 17:11
     */
    private String job;

    @Override
    public void setJob(String job) {
        this.job = job;
    }
    @Override
    public String getJob() {
        return this.job;
    }
    @Override
    public void update(WaterQualitySubject subject) {
        //这里采用拉模式，获取目标对象的本身
        System.out.println(this.job+"获取到通知，当前污染级别为："+subject.getPolluteLevel());
    }
}
