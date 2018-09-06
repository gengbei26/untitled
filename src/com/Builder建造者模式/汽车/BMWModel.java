package com.Builder建造者模式.汽车;

/**
 * @ClassName BMWModel
 * @Description 宝马汽车模型
 * @Author deus
 * @Data 2018/9/6 11:28
 * @Version 1.0
 **/
public class BMWModel extends CarModel {
    @Override
    protected void Start() {
        System.out.println("宝马汽车启动了");
    }

    @Override
    protected void Stop() {
        System.out.println("宝马汽车停下来了");
    }

    @Override
    protected void Alarm() {
        System.out.println("宝马汽车按喇叭啦，嗒嗒嗒。。");
    }

    @Override
    protected void EngineBoom() {
        System.out.println("宝马汽车引擎声音");
    }
}
