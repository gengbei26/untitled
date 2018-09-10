package com.Command命令模式.主板例子;

/**
 * @ClassName ResetCommand
 * @Description 重启命令的实现
 * @Author deus
 * @Data 2018/9/10 17:01
 * @Version 1.0
 **/
public class ResetCommand implements ICommand {
    //持有真正实现命令的接收者--主板对象
    private IMainBoardApi mainBoard;

    //构造方法，传入主板对象
    public ResetCommand(IMainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void Execute() {
        this.mainBoard.Reset();
    }
}
