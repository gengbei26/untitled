package com.Command命令模式.点菜;

/**
 * @ClassName ICommand
 * @Description 命令接口，声明执行的操作
 * @Author deus
 * @Data 2018/9/11 14:19
 * @Version 1.0
 **/
public interface ICommand {
    //执行命令对应的操作
    //开始做菜的方法
    void Execute();


    //设置命令的接收者
    //设置由哪个厨师对象来做
    void setCookApi(ICookApi cookApi);

    //命令对应的桌号
    //做给哪个桌号
    int getTableNum();
}
