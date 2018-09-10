package com.Command命令模式.主板例子;

/**
 * @ClassName OpenCommand
 * @Description 开机命令的实现
 * @Author deus
 * @Data 2018/9/10 15:43
 * @Version 1.0
 **/
public class OpenCommand implements ICommand {
    //持有真正实现命令的接收者--主板对象
    private IMainBoardApi mainBoard;

    //构造方法，传入主板对象
    public OpenCommand(IMainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void Execute() {
        //对于命令对象，根本不知道如何开机，会调用主板对象
        //让主板对象去完成开机的功能
        this.mainBoard.Open();
    }
}
