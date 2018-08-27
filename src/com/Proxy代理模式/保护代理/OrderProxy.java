package com.Proxy代理模式.保护代理;

/**
 * @ClassName OrderProxy
 * @Description TODO
 * @Author deus
 * @Data 2018/8/24 17:12
 * @Version 1.0
 **/
public class OrderProxy implements OrderApi {
    /**
     * @Author deus
     * @Description 持有被代理的具体的目标对象
     * @Date 2018/8/24 17:13
     */
    private Order order;

    public OrderProxy(Order order) {
        this.order = order;
    }

    @Override
    public String getProductName() {
        return this.order.getProductName();
    }

    @Override
    public void setProductName(String productName, String user) {
        if (user != null && user.equals(this.getOrderUser())) {
            order.setProductName(productName, user);
        } else {
            System.out.println("对不起" + user + ",您无权修改订单中的产品名称");
        }
    }

    @Override
    public int getOrderNum() {
        return this.order.getOrderNum();
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        if (user != null && user.equals(this.getOrderUser())) {
            order.setOrderNum(orderNum, user);
        } else {
            System.out.println("对不起" + user + ",您无权修改订单中的订购数量");
        }
    }

    @Override
    public String getOrderUser() {
        return this.order.getOrderUser();
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        if (user != null && user.equals(this.getOrderUser())) {
            order.setOrderUser(orderUser, user);
        } else {
            System.out.println("对不起" + user + ",您无权修改订单中的订购人");
        }
    }
}
