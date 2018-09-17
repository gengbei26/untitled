package com.Command命令模式.点菜;

/**
 * @ClassName CookManager
 * @Description 后厨的管理类，通过此类让后厨进行运行状态
 * @Author deus
 * @Data 2018/9/13 15:38
 * @Version 1.0
 **/
public class CookManager {
    //用来控制是否需要创建厨师，如果已经创建了就不要再执行了
    private static boolean runFlag = false;

    //运行厨师管理，创建厨师对象并启动他们相应的线程
    //无论运行多少次，创建厨师对象和启动线程的工作只做一次
    //这里决定有几个厨师同时工作
    public static void runCookManager(){
        if(!CookManager.runFlag){
            CookManager.runFlag = true;
            HotCook cookOne = new HotCook("张三");
            HotCook cookTwo = new HotCook("李四");
            HotCook cookThree = new HotCook("王五");

            Thread threadOne = new Thread(cookOne);
            threadOne.start();
            Thread threadTwo = new Thread(cookTwo);
            threadTwo.start();
            Thread threadThree = new Thread(cookThree);
            threadThree.start();
        }
    }
}
