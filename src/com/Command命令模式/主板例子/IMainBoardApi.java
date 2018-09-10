package com.Command命令模式.主板例子;

/**
 * @ClassName IMainBoardApi
 * @Description 主板的接口
 * @Author deus
 * @Data 2018/9/10 15:37
 * @Version 1.0
 **/
public interface IMainBoardApi {
    //定义主板具有开机的功能
    void Open();
    //定义主板具有重启的功能
    void Reset();
}
