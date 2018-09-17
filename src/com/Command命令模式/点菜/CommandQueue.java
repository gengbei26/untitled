package com.Command命令模式.点菜;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CommandQueue
 * @Description 命令队列类
 * @Author deus
 * @Data 2018/9/11 17:08
 * @Version 1.0
 **/
public class CommandQueue {
    //文件名
    private final static String FILE_NAME = "CmdQueue.txt";

    //存储命令对象的队列
    //记录所有被点的菜品，下面两个方法都是操作此队列，此队列使厨师与做菜的命令完全解耦
    //厨师只从队列中取出菜品来做，不会管是哪个桌号的菜品
    //客户只发出命令，也就是点菜，不管是哪个厨师来做
    //其实这里还可以延伸出另个需求，比如某个著名厨师被客户指定来做某道菜
    //private static List<ICommand> listCmd = new ArrayList<>();
    private static  List<ICommand> listCmd;
    //从日志中获取上一次还没有做完的命令，如果没有，那就新建一个队列
    static {
        CommandQueue.listCmd = FileOpeUtil.readFile(CommandQueue.FILE_NAME);
        if(CommandQueue.listCmd == null){
            CommandQueue.listCmd = new ArrayList<>();
        }
    }

    //服务员传过来一个新的菜单，需要同步
    //因为同时会有很多的服务传入菜单，而同时又有很多厨师在从队列里取值
    public synchronized static void addMenu(MenuCommand menu){
        //循环取出菜单中的菜品，加入到队列中
        for(ICommand cmd : menu.getCommands()){
            CommandQueue.listCmd.add(cmd);
        }
        //记录请求日志
        FileOpeUtil.writeFile(CommandQueue.FILE_NAME, CommandQueue.listCmd);
    }

    //厨师从命令队列里面获取命令对象进行处理，需求同步
    public synchronized static ICommand getOneCommand(){
        ICommand cmd = null;
        if(CommandQueue.listCmd.size() > 0){
            //取出队列的第一个，因为是约定的按照加入的先后来处理
            cmd = CommandQueue.listCmd.get(0);
            //同时从队列里去掉这个命令对象
            CommandQueue.listCmd.remove(0);
            //记录请求日志
            FileOpeUtil.writeFile(CommandQueue.FILE_NAME, CommandQueue.listCmd);
        }
        return cmd;
    }
}
