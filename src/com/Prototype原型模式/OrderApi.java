package com.Prototype原型模式;

public interface OrderApi {
    int getOrderProductNum();
    void setOrderProductNum(int num);
    OrderApi cloneOrder();
}
