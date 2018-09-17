package com.Command命令模式.点菜;

/**
 * @ClassName CookClient
 * @Description TODO
 * @Author deus
 * @Data 2018/9/11 16:46
 * @Version 1.0
 **/
public class CookClient {
    public static void main(String[] args) {
//        //客户只是负责向服务员点菜就好了
//        //创建服务员
//        Waiter waiter = new Waiter();
//
//        //创建命令对象，就是要点的菜
//        ICommand chop = new ChopCommand();
//        ICommand kelp = new KelpCommand();
//
//        //点菜，把这些菜让服务员记录下来
//        waiter.orderDish(chop);
//        waiter.orderDish(kelp);
//
//        waiter.orderOver();

        CookManager.runCookManager();
        //这里模拟场景，由一个服务员分别为5个桌的人点菜
        for(int i=1;i<5;i++){
            //创建服务员
            Waiter waiter = new Waiter();

            //创建命令对象，就是要点的菜，这里只有两种菜品可以被点
            ICommand chop = new ChopCommand(i);
            ICommand kelp = new KelpCommand(i);

            //点菜，就是把这些菜让服务员记录下来
            //这里模拟每次都点两道菜
            waiter.orderDish(chop);
            waiter.orderDish(kelp);

            //点菜完毕
            waiter.orderOver();

        }
    }
}
