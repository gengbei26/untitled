package com.Command命令模式.点菜;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName MenuCommand
 * @Description 菜单对象，这是个宏命令对象
 * @Author deus
 * @Data 2018/9/11 14:49
 * @Version 1.0
 **/
public class MenuCommand implements ICommand {
    //记录组合菜单的多个菜单品，也就是多个命令对象的集合
    private Collection<ICommand> col = new ArrayList<>();

    //点菜，把菜品加入到菜单中
    public void addCommand(ICommand cmd){
        this.col.add(cmd);
    }

    @Override
    public void setCookApi(ICookApi cookApi) {
        //什么也不做
    }

    @Override
    public int getTableNum() {
        //什么也不做
        return 0;
    }

    @Override
    public void Execute() {
//        //循环执行菜单里的每道菜
//        for(ICommand cmd : col){
//            cmd.Execute();
//        }

        //这里是将菜单加入到队列中
        CommandQueue.addMenu(this);
    }
    //获取菜单中的多个命令对象
    public Collection<ICommand> getCommands(){
        return this.col;
    }
}
