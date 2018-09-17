package com.Command命令模式.点菜;

/**
 * @ClassName Waiter
 * @Description 服务员，负责组合菜单，组装每个菜和具体的实现者
 *                  还负责执行调用，相当于标准Command模式的Client+Invoker调用者
 * @Author deus
 * @Data 2018/9/11 16:25
 * @Version 1.0
 **/
public class Waiter {
    private MenuCommand menuCommand = new MenuCommand();
    //客户点菜，每道菜是一个命令对象
    public void orderDish(ICommand cmd){
//        //传入的cmd命令没有和接收者（具体的实现者，厨师）组装
//        //这里有两个厨师
//        ICookApi hotCook = new HotCook();
//        ICookApi coolCook = new CoolCook();
//        //根据菜的类型判断给哪个厨师来做
//        if(cmd instanceof ChopCommand){
//            //热菜交给热菜厨师来做
//            cmd.setCookApi(hotCook);
//        }else if(cmd instanceof KelpCommand){
//            //凉菜交给凉菜厨师来做
//            cmd.setCookApi(coolCook);
//        }
        menuCommand.addCommand(cmd);
    }
    //客户点菜完毕，表示要执行命令了
    //这里就是执行菜单这个组合命令
    public void orderOver(){
        this.menuCommand.Execute();
    }
}
