package com.Mediator中介者模式.标准的中介者模式;

/**
 * @ClassName CPU_Colleague
 * @Description CPU类
 * @Author deus
 * @Data 2018/8/27 16:29
 * @Version 1.0
 **/
public class CPU_Colleague extends Colleague {
    public CPU_Colleague(Mediator mediator) {
        super(mediator);
    }
    //视频数据
    private String videoData = "";
    //音频数据
    private String soundData = "";
    public String getVideoData(){
        return this.videoData;
    }
    public String getSoundData(){
        return this.soundData;
    }
    public void executeData(String data){
        String[] ss = data.split(",");
        this.videoData = ss[0];
        this.soundData = ss[1];
        //通知主板，CPU的工作完成
        this.getMediator().changed(this);
    }

}
