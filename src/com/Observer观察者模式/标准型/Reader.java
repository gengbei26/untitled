package com.Observer观察者模式.标准型;

/**
 * @ClassName Reader
 * @Description 读者对象，具体的观察者
 * @Author deus
 * @Data 2018/8/29 10:40
 * @Version 1.0
 **/
public class Reader implements Observer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(name + "收到报纸了，阅读它。内容是===" + ((NewsPaper)subject).getContent());
    }
}
