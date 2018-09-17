package com.Command命令模式.点菜;

import java.io.Serializable;

/**
 * @ClassName KelpCommand
 * @Description 命令对象，海带
 * @Author deus
 * @Data 2018/9/11 16:32
 * @Version 1.0
 **/
public class KelpCommand implements ICommand, Serializable {
    //持有具体做菜的厨师对象
    private ICookApi cookApi = null;
    private int tableNum;

    @Override
    //设置具体做菜的厨师对象
    public void setCookApi(ICookApi cookApi) {
        this.cookApi = cookApi;
    }

    @Override
    public int getTableNum() {
        return this.tableNum;
    }

    @Override
    public void Execute() {
        this.cookApi.Cook(this.tableNum,"海带呀海带");
    }

    //构造方法，传入点菜的桌号
    public KelpCommand(int tableNum) {
        this.tableNum = tableNum;
    }
}
