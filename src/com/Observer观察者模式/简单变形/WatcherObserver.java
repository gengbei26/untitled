package com.Observer观察者模式.简单变形;

/**
 * @ClassName WatcherObserver
 * @Description 水质观察者接口
 * @Author deus
 * @Data 2018/8/29 15:59
 * @Version 1.0
 **/
public interface WatcherObserver {
    /**
     * @Author deus
     * @Description 被通知的方法
     * // 这里使用拉模式，将目标对象本身传递给观察者
     * // 与另一种推模式的区别，主要是update方法参数不同，推模式是传递具体的信息
     * // 推模式是假定目标对象知道观察者需要的数据；
     * // 而拉模式是不知道观察者具体需要什么数据，只能把自身传给观察者，让观察者按需取值
     * @Date 2018/8/29 16:39
     */
    void update(WaterQualitySubject subject);
    /**
     * @Author deus
     * @Description 设置观察人员的职务
     * @Date 2018/8/29 16:40
     */
    void setJob(String job);
    /**
     * @Author deus
     * @Description 获取观察人员的职务
     * @Date 2018/8/29 16:40
     */
    String getJob();
}
