package com.Builder建造者模式.汽车;

import java.util.ArrayList;

/**
 * @ClassName Director
 * @Description 导演类，封装建造对象的顺序和过程
 * @Author deus
 * @Data 2018/9/6 15:15
 * @Version 1.0
 **/
public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    //A型奔驰汽车,先启动，再停止，其他的都没有
    public BenzModel getBenzModelA(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }

    //B型奔驰汽车，先发动引擎，再启动，然后停止，没有喇叭
    public BenzModel getBenzModelB(){
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }

    //C型奔驰汽车，先按喇叭炫一下，再启动，然后停止
    public BenzModel getBenzModelC(){
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }

    //B型奔驰汽车，一开始就跑，永不停止
    public BenzModel getBenzModelD(){
        this.sequence.clear();
        this.sequence.add("start");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel)this.benzBuilder.getCarModel();
    }
}
