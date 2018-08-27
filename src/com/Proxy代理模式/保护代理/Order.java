package com.Proxy代理模式.保护代理;

/**
 * @ClassName Order
 * @Description TODO
 * @Author deus
 * @Data 2018/8/24 17:00
 * @Version 1.0
 **/
public class Order implements OrderApi {
    private String productName;
    private int orderNum;
    private String orderUser;

    public Order(String productName, int orderNum, String orderUser) {
        this.productName = productName;
        this.orderNum = orderNum;
        this.orderUser = orderUser;
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    @Override
    public void setProductName(String productName, String user) {
        this.productName = productName;
    }

    @Override
    public int getOrderNum() {
        return this.orderNum;
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        this.orderNum = orderNum;
    }

    @Override
    public String getOrderUser() {
        return this.orderUser;
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        this.orderUser = orderUser;
    }
}
