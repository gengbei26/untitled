package com.Builder建造者模式.汽车;

import java.util.ArrayList;

/**
 * @ClassName CarModel
 * @Description 汽车模型的抽象类，此处使用接口或抽象类都行
 * @Author deus
 * @Data 2018/9/6 11:05
 * @Version 1.0
 **/
public abstract class CarModel {
    //各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<>();
    //启动
    protected abstract void Start();
    //停止
    protected abstract void Stop();
    //喇叭开始叫了
    protected abstract void Alarm();
    //引擎开始轰鸣
    protected abstract void EngineBoom();

    final public void Run(){
        for(int i=0;i<this.sequence.size();i++){
            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.Start(); //启动
            }else if(actionName.equalsIgnoreCase("stop")){
                this.Stop(); //停止
            }else if(actionName.equalsIgnoreCase("alarm")){
                this.Alarm(); //喇叭开始叫了
            }else if(actionName.equalsIgnoreCase("engine boom")){
                this.EngineBoom(); //引擎开始轰鸣
            }
        }
    }
    //设置执行的顺序
    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
