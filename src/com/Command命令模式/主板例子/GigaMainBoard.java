package com.Command命令模式.主板例子;

/**
 * @ClassName GigaMainBoard
 * @Description 技嘉主板类，开机命令的真正实现者，在Command模式中充当Receiver接收者
 * @Author deus
 * @Data 2018/9/10 15:38
 * @Version 1.0
 **/
public class GigaMainBoard implements IMainBoardApi {

    @Override
    public void Open() {
        System.out.println("技嘉主板正在开机，请稍等。。。");
        System.out.println("接通电源。。");
        System.out.println("设备检查。。");
        System.out.println("装载系统。。");
        System.out.println("机器正常运转起来。。");
        System.out.println("已经正常打开。");
    }
    @Override
    public void Reset() {
        System.out.println("正在重启机器，请稍等。。。");
        System.out.println("重启完成，已经正常打开。");
    }

}
