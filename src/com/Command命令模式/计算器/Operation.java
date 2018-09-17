package com.Command命令模式.计算器;

/**
 * @ClassName Operation
 * @Description TODO
 * @Author deus
 * @Data 2018/9/11 10:38
 * @Version 1.0
 **/
public class Operation implements IOperationApi {
    private int result;

    @Override
    public int getResult() {
        return this.result;
    }

    @Override
    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public void addition(int num) {
        this.result += num;
    }

    @Override
    public void subtraction(int num) {
        this.result -= num;
    }
}
