package com.Mediator中介者模式;

/**
 * @ClassName CDDriver_Colleague
 * @Description 光驱类
 * @Author deus
 * @Data 2018/8/27 16:28
 * @Version 1.0
 **/
public class CDDriver_Colleague extends Colleague {
    public CDDriver_Colleague(Mediator mediator) {
        super(mediator);
    }

    private String data = "";

    public String getData(){
        return this.data;
    }
    public void readCD(){
        this.data = "设计模式,值得好好研究";
        //通知主板，自己的状态发生了改变
        this.getMediator().changed(this);
    }
}
