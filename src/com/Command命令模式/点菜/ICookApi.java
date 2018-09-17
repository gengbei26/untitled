package com.Command命令模式.点菜;

/**
 * @ClassName ICookApi
 * @Description 厨师的接口
 * @Author deus
 * @Data 2018/9/11 14:14
 * @Version 1.0
 **/
public interface ICookApi {
    //抽象做菜的方法
    //桌号，菜名
    void Cook(int tableNum, String name);
}
