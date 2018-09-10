package com.Command命令模式.主板例子;

/**
 * @ClassName CommandClient
 * @Description TODO
 * @Author deus
 * @Data 2018/9/10 15:57
 * @Version 1.0
 **/
public class CommandClient {
    public static void main(String[] args) {
        //1.把命令和真正的实现组合起来
        //把机箱上的连接线插到主板上
        IMainBoardApi mainBoard = new GigaMainBoard();
        OpenCommand openCommand = new OpenCommand(mainBoard);
        ResetCommand resetCommand = new ResetCommand(mainBoard);
        //2.为机箱上的按钮设置对应的命令，让按钮知道该干什么
        Box box = new Box();
        box.setOpenCommand(openCommand);
        //3.模拟按下机箱上的按钮
        box.openButtonPressed();

        //4.为机箱上按钮设置重启命令
        box.setResetCommand(resetCommand);
        //3.模拟按下重启的按钮
        box.resetButtonPressed();

        //有个疑问，当时设置按钮命令时，传入另一个命令对象，后面执行时用的就是传入对象的execute()方法
        //感觉不管调用box对象的哪个设置方法都不重要，主要看传入的对象了？？？？
        //因两种命令的接收者对象相同，所以传入参数决定最终执行哪个具体实现
        //如何避免使用中传错参数，该怎么约束？？？
        box.setResetCommand(openCommand);
        box.resetButtonPressed();
    }
}
