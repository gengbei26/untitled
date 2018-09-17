package com.Command命令模式.计算器;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Calculator
 * @Description 计算器类，计算器上有加法按钮、减法按钮
 * @Author deus
 * @Data 2018/9/11 10:56
 * @Version 1.0
 **/
public class Calculator {
    private ICommand additionCmd = null;
    private ICommand subtractionCmd = null;

    //命令操作的历史记录，在撤销的时候用
    private List<ICommand> listUndoCmd = new ArrayList<>();
    
    //命令操作的历史记录，在恢复时用
    private List<ICommand> listRedoCmd = new ArrayList<>();
    
    //设置执行加法的命令对象
    public void setAdditionCmd(ICommand additionCmd) {
        this.additionCmd = additionCmd;
    }

    //设置执行减法的命令对象
    public void setSubtractionCmd(ICommand subtractionCmd) {
        this.subtractionCmd = subtractionCmd;
    }

    //提供给客户使用，执行加法功能
    public void AdditionPressed(){
        this.additionCmd.Execute();
        //将操作添加到历史记录
        this.listUndoCmd.add(this.additionCmd);
    }

    //提供给客户使用，执行减法功能
    public void SubtractionPressed(){
        this.subtractionCmd.Execute();
        //将操作添加到历史记录
        this.listUndoCmd.add(this.subtractionCmd);
    }

    public void undoPressed(){
        if(this.listUndoCmd.size() > 0){
            //取出最后一个命令来撤销
            ICommand cmd = this.listUndoCmd.get(this.listUndoCmd.size() - 1);
            //执行撤销操作
            cmd.Undo();
            //先添加到恢复的历史记录
            this.listRedoCmd.add(cmd);
            //然后从撤销的历史记录中删除
            this.listUndoCmd.remove(cmd);
        }else{
            System.out.println("很抱歉，没有可撤销的命令");
        }
    }

    public void redoPressed(){
        if(this.listRedoCmd.size() > 0){
            ICommand cmd = this.listRedoCmd.get(this.listRedoCmd.size() - 1);
            cmd.Execute();
            //先添加到撤销的历史记录
            this.listUndoCmd.add(cmd);
            //然后从恢复的历史记录中删除
            this.listRedoCmd.remove(cmd);
        }else{
            System.out.println("很抱歉，没有可以恢复的命令");
        }
    }
    
}
