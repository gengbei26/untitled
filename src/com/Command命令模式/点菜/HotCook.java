package com.Command命令模式.点菜;

/**
 * @ClassName HotCook
 * @Description 厨师对象，做热菜的厨师
 * @Author deus
 * @Data 2018/9/11 14:17
 * @Version 1.0
 **/
public class HotCook implements ICookApi, Runnable {
    private String name;

    public HotCook(String name) {
        this.name = name;
    }

    @Override
    public void Cook(int tableNum, String name) {
        int cookTime = (int) (20 * Math.random());
        System.out.println(this.name + "厨师正在为" + tableNum + "号桌做热菜：" + name);
        try {
            Thread.sleep(cookTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name + "厨师为" + tableNum + "号桌做好了：" + name + "，共计耗时=" + cookTime + "秒");
    }

    //因同时会有多个厨师从队列中取命令来执行，所以这里要实现多线程接口
    @Override
    public void run() {
        while (true) {
            //从命令队列里获取命令对象
            ICommand cmd = CommandQueue.getOneCommand();
            if (cmd != null) {
                //说明取到命令对象了，这个命令对象还没有设置接收者
                //因为前面还不知道到底哪一个厨师来真正执行这个命令
                //现在知道了，就是当前厨师实例，设置到命令对象里面
                cmd.setCookApi(this);
                //然后真正执行这个命令
                cmd.Execute();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
