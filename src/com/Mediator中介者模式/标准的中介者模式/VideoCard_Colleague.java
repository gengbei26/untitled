package com.Mediator中介者模式.标准的中介者模式;

/**
 * @ClassName VideoCard_Colleague
 * @Description 显卡类
 * @Author deus
 * @Data 2018/8/27 16:53
 * @Version 1.0
 **/
public class VideoCard_Colleague extends Colleague {
    public VideoCard_Colleague(Mediator mediator) {
        super(mediator);
    }
    public void showData(String data){
        System.out.println("正在观看的是：" + data);
    }
}
