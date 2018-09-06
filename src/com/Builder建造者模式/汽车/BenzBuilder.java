package com.Builder建造者模式.汽车;

import java.util.ArrayList;

/**
 * @ClassName BenzBuilder
 * @Description 奔驰汽车的具体建造者
 * @Author deus
 * @Data 2018/9/6 11:18
 * @Version 1.0
 **/
public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
