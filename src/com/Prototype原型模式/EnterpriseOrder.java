package com.Prototype原型模式;

/**
 * @ClassName EnterpriseOrder
 * @Description TODO
 * @Author deus
 * @Data 2018/8/13 16:07
 * @Version 1.0
 **/
public class EnterpriseOrder implements OrderApi {
    private String enterpriseName;
    private String productId;
    private int orderProductNum = 0;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int getOrderProductNum() {
        return orderProductNum;
    }

    @Override
    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    @Override
    public String toString() {
        return "企业名称：" + this.enterpriseName +
                ",产品ID：" + this.productId +
                "，数据：" + this.orderProductNum;
    }

    @Override
    public OrderApi cloneOrder() {
        EnterpriseOrder order  = new EnterpriseOrder();
        order.setEnterpriseName(this.enterpriseName);
        order.setProductId(this.productId);
        order.setOrderProductNum(this.orderProductNum);

        return order;
    }
}
