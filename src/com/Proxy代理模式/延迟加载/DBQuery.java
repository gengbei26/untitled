package com.Proxy代理模式.延迟加载;

/**
 * @ClassName DBQuery
 * @Description TODO
 * @Author deus
 * @Data 2019/6/27 17:41
 * @Version 1.0
 **/
public class DBQuery implements IDBQuery {
    public DBQuery() {
        try{
            Thread.sleep(3000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public String request() {
        return "DBQuery: request string";
    }
}
