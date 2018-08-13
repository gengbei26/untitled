package com.Prototype原型模式;

/**
 * @ClassName OrderBusiness
 * @Description TODO
 * @Author deus
 * @Data 2018/8/13 16:12
 * @Version 1.0
 **/
public class OrderBusiness {
    public void saveOrder(OrderApi order){
        //1.判断当前的产品数量是否大于1000
        while(order.getOrderProductNum() > 1000){
            //2.如果大于，就折分
            //2.1再建一份订单，跟传入的订单除了数量不一样外，其他都相同
            OrderApi newOrder = order.cloneOrder();
            //对新对象赋值，产品数量为1000
            newOrder.setOrderProductNum(1000);

            //2.2原来的订单保留，把数量设置成减少1000
            order.setOrderProductNum(
                    order.getOrderProductNum() - 1000);

            System.out.println("拆分生成订单:" + newOrder + "，订单数量：" + newOrder.getOrderProductNum());
            System.out.println("原订单：" + order + "，原订单数量：" + order.getOrderProductNum());

        }

    }

}
