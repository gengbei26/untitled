package com.Mediator中介者模式.标准的中介者模式;

/**
 * @ClassName MotherBoard
 * @Description TODO
 * @Author deus
 * @Data 2018/8/27 16:57
 * @Version 1.0
 **/
public class MotherBoard implements Mediator {
    private CDDriver_Colleague cdDriver = null;
    private CPU_Colleague cpu = null;
    private VideoCard_Colleague videoCard = null;
    private SoundCard_Colleague soundCard = null;

    public void setCdDriver(CDDriver_Colleague cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU_Colleague cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(VideoCard_Colleague videoCard) {
        this.videoCard = videoCard;
    }

    public void setSoundCard(SoundCard_Colleague soundCard) {
        this.soundCard = soundCard;
    }

    private void opeCDDriverReadData(CDDriver_Colleague cd){
        //第一步，光驱读取数据
        String data = cd.getData();
        //第二步，把数据传递给cpu进行处理
        this.cpu.executeData(data);
    }
    private void opeCPU(CPU_Colleague cpu){
        //第一步，获取CPU处理后的数据
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();
        //第二步，把这些数据传递给显卡和声卡，并展示出来
        this.videoCard.showData(videoData);
        this.soundCard.soundData(soundData);
    }
    @Override
    public void changed(Colleague colleague) {
        if(colleague == cdDriver){
            //表示光驱读取数据了
            this.opeCDDriverReadData((CDDriver_Colleague)colleague);
        }else if(colleague == cpu){
            //表示CPU处理完了
            this.opeCPU((CPU_Colleague) colleague);
        }
    }
}
