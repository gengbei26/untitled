package com.Mediator中介者模式;

/**
 * @ClassName MediatorClient
 * @Description TODO
 * @Author deus
 * @Data 2018/8/27 11:21
 * @Version 1.0
 **/
public class MediatorClient {
    public static void main(String[] args) {
        //第一步，创建中介者----主板对象
        MotherBoard mediator = new MotherBoard();
        //第二步，创建同事类
        CDDriver_Colleague cd = new CDDriver_Colleague(mediator);
        CPU_Colleague cpu = new CPU_Colleague(mediator);
        VideoCard_Colleague vc = new VideoCard_Colleague(mediator);
        SoundCard_Colleague sc = new SoundCard_Colleague(mediator);
        //第三步，让中介者知道所有的同事
        mediator.setCdDriver(cd);
        mediator.setCpu(cpu);
        mediator.setVideoCard(vc);
        mediator.setSoundCard(sc);
        //第四步，开始看电影，把光盘放入光驱，光驱开始读盘
        cd.readCD();
    }
}
