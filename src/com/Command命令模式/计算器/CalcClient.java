package com.Command命令模式.计算器;

/**
 * @ClassName CalcClient
 * @Description 具有撤销和恢复功能
 * @Author deus
 * @Data 2018/9/11 11:35
 * @Version 1.0
 **/
public class CalcClient {
    public static void main(String[] args) {
        //1.创建接收者
        IOperationApi operation = new Operation();

        //创建命令对象，并组装命令和接收者
        AdditionCommand additionCmd = new AdditionCommand(operation,5);
        SubtractionCommand subtractionCmd = new SubtractionCommand(operation,3);

        //2.把命令设置到持有者，也就是计算器里面
        Calculator calculator = new Calculator();
        calculator.setAdditionCmd(additionCmd);
        calculator.setSubtractionCmd(subtractionCmd);

        System.out.println("初始值为：" + operation.getResult());

        calculator.AdditionPressed();
        System.out.println("一次加法运算后的结果为：" + operation.getResult());

        calculator.SubtractionPressed();
        System.out.println("一次减法运算后的结果为：" + operation.getResult());

        calculator.undoPressed();
        System.out.println("撤销一次后的结果为：" + operation.getResult());

        calculator.undoPressed();
        System.out.println("撤销第二次的结果为：" + operation.getResult());

        calculator.redoPressed();
        System.out.println("恢复一次后的结果为：" + operation.getResult());

        calculator.redoPressed();
        System.out.println("恢复第二次的结果为：" + operation.getResult());
    }
}
