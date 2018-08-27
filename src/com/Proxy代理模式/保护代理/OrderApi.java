package com.Proxy代理模式.保护代理;

/**
 * @ClassName OrderApi
 * @Description 订单对象接口
 * @Author deus
 * @Data 2018/8/24 14:53
 * @Version 1.0
 **/
public interface OrderApi {
    /**
     * @Author deus
     * @Description 获取产品名称
     * @Date 2018/8/24 15:12
     */
    String getProductName();

    /**
     * @Author deus
     * @Description 设置产品名称
     * @Date 2018/8/24 15:14
     */
    void setProductName(String productName,String user);

    /**
     * @Author deus
     * @Description 获取数量
     * @Date 2018/8/24 15:15
     */
    int getOrderNum();

    /**
     * @Author deus
     * @Description 设置数量
     * @Date 2018/8/24 15:17
     */
    void setOrderNum(int orderNum, String user);

    /**
     * @Author deus
     * @Description 获取人员
     * @Date 2018/8/24 15:24
     */
    String getOrderUser();

    /**
     * @Author deus
     * @Description 设置人员
     * @Date 2018/8/24 15:24
     */
    void setOrderUser(String orderUser,String user);
}
