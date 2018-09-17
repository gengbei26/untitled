package com.Command命令模式.计算器;

/**
 * @ClassName ICommand
 * @Description 命令接口，声明执行的操作，支持可撤销的操作
 * @Author deus
 * @Data 2018/9/11 10:40
 * @Version 1.0
 **/
public interface ICommand {
    //执行命令的操作
    void Execute();
    //撤销命令的操作
    void Undo();
}
