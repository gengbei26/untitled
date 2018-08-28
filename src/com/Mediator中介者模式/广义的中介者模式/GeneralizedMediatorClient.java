package com.Mediator中介者模式.广义的中介者模式;

/**
 * @ClassName GeneralizedMediatorClient
 * @Description 广义的中介者模式，简化了中介者对象的接口，把中介者对象做成单例模式，简化了同事类的父类
 * @Author deus
 * @Data 2018/8/28 11:23
 * @Version 1.0
 **/
public class GeneralizedMediatorClient {
    public static void main(String[] args) {
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
        Dep dep = new Dep();
        dep.setDepId("dep1");
        Dep dep2 = new Dep();
        dep2.setDepId("dep2");
        User user = new User();
        user.setUserId("user1");

        System.out.println("撤销部门前---------");
        mediator.showUserDeps(user);
        //执行撤销部门
        dep.deleteDep();
        System.out.println("撤销部门后---------");
        mediator.showUserDeps(user);

        System.out.println("-------------------");
        System.out.println("人员离职前---------");
        mediator.showDepUsers(dep2);
        //执行人员离职
        user.deleteUser();
        System.out.println("人员离职后---------");
        mediator.showDepUsers(dep2);
    }
}
