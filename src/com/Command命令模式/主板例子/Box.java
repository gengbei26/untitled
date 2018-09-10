package com.Command命令模式.主板例子;

/**
 * @ClassName Box
 * @Description 机箱对象，本身有按钮，持有按钮对应的命令对象
 * @Author deus
 * @Data 2018/9/10 15:50
 * @Version 1.0
 **/
public class Box {
    private ICommand openCommand;
    private ICommand resetCommand;

    public void setOpenCommand(ICommand command){
        this.openCommand = command;
    }
    public void openButtonPressed(){
        openCommand.Execute();
    }

    public void setResetCommand(ICommand command){
        this.resetCommand = command;
    }
    public void resetButtonPressed(){
        resetCommand.Execute();
    }
}
