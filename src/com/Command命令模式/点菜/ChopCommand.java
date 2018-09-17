package com.Command命令模式.点菜;

import java.io.Serializable;

/**
 * @ClassName ChopCommand
 * @Description 命令对象，绿豆排骨汤
 *              此处的对象是封装的某道菜品的所有要素，包括被哪个桌号客户点的，由哪个厨师来做
 * @Author deus
 * @Data 2018/9/11 14:25
 * @Version 1.0
 **/
public class ChopCommand implements ICommand, Serializable {
    //持有具体做菜的厨师的对象
    private ICookApi cookApi = null;
    private int tableNum;

    //设置具体做菜的厨师对象
    @Override
    public void setCookApi(ICookApi cookApi) {
        this.cookApi = cookApi;
    }

    //获取桌号
    @Override
    public int getTableNum() {
        return this.tableNum;
    }

    @Override
    public void Execute() {
        this.cookApi.Cook(this.tableNum,"绿豆排骨汤");
    }

    //构造方法，传入点菜的桌号
    //说明该菜品是由哪个桌号的客人点的
    public ChopCommand(int tableNum) {
        this.tableNum = tableNum;
    }
}
