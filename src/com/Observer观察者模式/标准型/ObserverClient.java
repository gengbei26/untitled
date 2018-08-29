package com.Observer观察者模式.标准型;

/**
 * @ClassName ObserverClient
 * @Description TODO
 * @Author deus
 * @Data 2018/8/29 10:46
 * @Version 1.0
 **/
public class ObserverClient {
    public static void main(String[] args) {
        NewsPaper subject = new NewsPaper();
        Reader reader1 = new Reader();
        reader1.setName("张三");
        Reader reader2 = new Reader();
        reader2.setName("李四");
        Reader reader3 = new Reader();
        reader3.setName("王老五");

        subject.attach(reader1);
        subject.attach(reader2);
        subject.attach(reader3);

        subject.setContent("本期内容是观察者模式");
    }
}
