package com.Command命令模式.计算器;

/**
 * @ClassName IOperationApi
 * @Description 操作运算的接口
 * @Author deus
 * @Data 2018/9/11 10:34
 * @Version 1.0
 **/
public interface IOperationApi {
    //获取计算完成后的结果
    int getResult();
    //设置计算开始的初始值
    void setResult(int result);
    //加法
    void addition(int num);
    //减法
    void subtraction(int num);
}
