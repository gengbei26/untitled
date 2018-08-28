package com.Mediator中介者模式.标准的中介者模式;

/**
 * @ClassName SoundCard_Colleague
 * @Description TODO
 * @Author deus
 * @Data 2018/8/27 16:56
 * @Version 1.0
 **/
public class SoundCard_Colleague extends Colleague {
    public SoundCard_Colleague(Mediator mediator) {
        super(mediator);
    }
    public void soundData(String data){
        System.out.println("画面外的声音：" + data);
    }
}
