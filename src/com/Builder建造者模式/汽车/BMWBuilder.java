package com.Builder建造者模式.汽车;

import java.util.ArrayList;

/**
 * @ClassName BMWBuilder
 * @Description TODO
 * @Author deus
 * @Data 2018/9/6 14:57
 * @Version 1.0
 **/
public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
