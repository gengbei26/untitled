package com.Command命令模式.计算器;

/**
 * @ClassName SubtractionCommand
 * @Description TODO
 * @Author deus
 * @Data 2018/9/11 10:52
 * @Version 1.0
 **/
public class SubtractionCommand implements ICommand {
    //持有具体执行计算的对象
    private IOperationApi operation = null;
    //操作的数据
    private int opeNum;

    @Override
    public void Execute() {
        //转调接收者去真正执行功能，这个命令是做减法
        this.operation.subtraction(opeNum);
    }

    @Override
    public void Undo() {
        //转调接收者去真正执行功能，这个命令是做加法
        //这里要做减法的撤销功能，所以转调加法操作
        this.operation.addition(opeNum);
    }

    //构造函数，传入具体执行计算的对象
    public SubtractionCommand(IOperationApi operation, int opeNum) {
        this.operation = operation;
        this.opeNum = opeNum;
    }
}
