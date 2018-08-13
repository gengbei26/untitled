package com.Prototype原型模式;

/**
 * @ClassName OrderClient
 * @Description TODO
 * @Author deus
 * @Data 2018/8/13 16:42
 * @Version 1.0
 **/
public class OrderClient {
    public static void main(String[] args) {
        PersonalOrder op = new PersonalOrder();
        op.setOrderProductNum(2933);
        op.setCustomerName("张三");
        op.setProductId("P0001");

        OrderBusiness ob = new OrderBusiness();
        ob.saveOrder(op);
    }
}
