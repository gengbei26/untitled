package com.Mediator中介者模式;

/**
 * @ClassName Colleague
 * @Description TODO
 * @Author deus
 * @Data 2018/8/27 16:25
 * @Version 1.0
 **/
public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
    public Mediator getMediator(){
        return mediator;
    }
}
