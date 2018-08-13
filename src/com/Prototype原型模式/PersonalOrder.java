package com.Prototype原型模式;

/**
 * @ClassName PersonalOrder
 * @Description TODO
 * @Author deus
 * @Data 2018/8/13 15:33
 * @Version 1.0
 **/
public class PersonalOrder implements OrderApi {
    private String customerName;
    private String productId;
    private int orderProductNum = 0;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getOrderProductNum() {
        return orderProductNum;
    }

    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    /**
     * @Author deus
     * @Description
     * @Date 2018/8/13 15:58
     */
    @Override
    public OrderApi cloneOrder() {
        PersonalOrder order = new PersonalOrder();
        order.setCustomerName(this.customerName);
        order.setProductId(this.productId);
        order.setOrderProductNum(this.orderProductNum);

        return order;
    }
}
