package com.Builder建造者模式.汽车;

/**
 * @ClassName BenzModel
 * @Description 奔驰汽车模型
 * @Author deus
 * @Data 2018/9/6 11:21
 * @Version 1.0
 **/
public class BenzModel extends CarModel {

    @Override
    protected void Start() {
        System.out.println("奔驰汽车启动了");
    }

    @Override
    protected void Stop() {
        System.out.println("奔驰汽车停下来了");
    }

    @Override
    protected void Alarm() {
        System.out.println("奔驰汽车按喇叭啦，嘀嘀嘀。。");
    }

    @Override
    protected void EngineBoom() {
        System.out.println("奔驰汽车引擎声音是这样的啊");
    }
}
