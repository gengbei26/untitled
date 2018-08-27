package com.Mediator中介者模式;

/**
 * @ClassName Mediator
 * @Description 中介者对象的接口
 * @Author deus
 * @Data 2018/8/27 16:26
 * @Version 1.0
 **/
public interface Mediator {
    void changed(Colleague colleague);
}
