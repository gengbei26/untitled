package com.Command命令模式.点菜;

/**
 * @ClassName CoolCook
 * @Description TODO
 * @Author deus
 * @Data 2018/9/11 14:18
 * @Version 1.0
 **/
public class CoolCook implements ICookApi {
    @Override
    public void Cook(int tableNum, String name) {
        System.out.println(tableNum + "号桌的凉菜："+ name + "，已经做好");
    }
}
