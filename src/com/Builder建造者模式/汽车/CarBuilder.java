package com.Builder建造者模式.汽车;

import java.util.ArrayList;

/**
 * @ClassName CarBuilder
 * @Description 汽车建造者的抽象，此处使用接口或抽象类都行
 * @Author deus
 * @Data 2018/9/6 11:14
 * @Version 1.0
 **/
public abstract class CarBuilder {
    //设置组装顺序的抽象方法
    public abstract void setSequence(ArrayList<String> sequence);
    //获取组装后的汽车模型的抽象方法
    public abstract CarModel getCarModel();
}
