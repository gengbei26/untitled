package com.Observer观察者模式.标准型;

/**
 * @ClassName NewsPaper
 * @Description 报纸对象，具体的目标实现（被观察者）
 * @Author deus
 * @Data 2018/8/29 10:37
 * @Version 1.0
 **/
public class NewsPaper extends Subject {
    //报纸的内容
    private String content;

    public String getContent() {
        return content;
    }

    //设置报纸内容
    public void setContent(String content) {
        this.content = content;
        //报纸内容改变后，通知所有的读者
        super.notifyObservers();
    }
}
