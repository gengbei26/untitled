package com.Builder建造者模式.汽车;

import java.util.ArrayList;

/**
 * @ClassName CarClient
 * @Description
 * @Author deus
 * @Data 2018/9/6 13:55
 * @Version 1.0
 **/
public class CarClient {
    public static void main(String[] args) {
        Director director = new Director();
        for(int k=0;k<3;k++){
            director.getBenzModelA().Run();
        }
        for(int k=0;k<5;k++){
            director.getBenzModelB().Run();
        }
        for (int k=0;k<2;k++){
            director.getBenzModelD().Run();
        }
    }
}
