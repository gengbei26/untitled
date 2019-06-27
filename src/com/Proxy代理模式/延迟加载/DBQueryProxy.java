package com.Proxy代理模式.延迟加载;

/**
 * @ClassName DBQueryProxy
 * @Description TODO
 * @Author deus
 * @Data 2019/6/27 17:45
 * @Version 1.0
 **/
public class DBQueryProxy implements IDBQuery {
    private  DBQuery real = null;//我们创建一个代理对象，里面其实只有一个未初始化的DBQuery
    @Override
    public String request() {
        //在真正需要的时候才能创建真实对象，创建过程可能很慢
        if(real == null){
            real = new DBQuery();
        }
        //在多线程环境下，这里返回一个虚假类，类似于 Future 模式
        return real.request();
    }
}
