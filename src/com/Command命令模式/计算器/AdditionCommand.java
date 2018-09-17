package com.Command命令模式.计算器;

/**
 * @ClassName AdditionCommand
 * @Description 加法命令的实现对象
 * @Author deus
 * @Data 2018/9/11 10:45
 * @Version 1.0
 **/
public class AdditionCommand implements ICommand {
    //持有具体执行计算的对象
    private IOperationApi operation = null;
    //操作的数据
    private int opeNum;

    @Override
    public void Execute() {
        //转调接收者去真正执行功能，这个命令是做加法
        this.operation.addition(opeNum);
    }

    @Override
    public void Undo() {
        //转调接收者去真正执行功能，这个命令是做减法
        //这里要做加法的撤销功能，所以转调减法操作
        this.operation.subtraction(opeNum);
    }

    //构造函数，传入具体执行计算的对象
    public AdditionCommand(IOperationApi operation, int opeNum) {
        this.operation = operation;
        this.opeNum = opeNum;
    }
}
