package com.Mediator中介者模式.广义的中介者模式;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName DepUserMediatorImpl
 * @Description 单例的中介者实现类
 * @Author deus
 * @Data 2018/8/28 11:34
 * @Version 1.0
 **/
public class DepUserMediatorImpl {
    private static DepUserMediatorImpl mediator = new DepUserMediatorImpl();

    private DepUserMediatorImpl() {
        this.InitTestData();
    }

    public static DepUserMediatorImpl getInstance() {
        return mediator;
    }

    private ArrayList<DepUserModel> depUserCol = null;

    private void InitTestData() {
        depUserCol = new ArrayList<>();
        DepUserModel du1 = new DepUserModel();
        du1.setDepId("dep1");
        du1.setDepUserId("du1");
        du1.setUserId("user1");
        depUserCol.add(du1);

        DepUserModel du2 = new DepUserModel();
        du2.setDepId("dep1");
        du2.setDepUserId("du2");
        du2.setUserId("user2");
        depUserCol.add(du2);

        DepUserModel du3 = new DepUserModel();
        du3.setDepId("dep2");
        du3.setDepUserId("du3");
        du3.setUserId("user3");
        depUserCol.add(du3);

        DepUserModel du4 = new DepUserModel();
        du4.setDepId("dep2");
        du4.setDepUserId("du4");
        du4.setUserId("user4");
        depUserCol.add(du4);

        DepUserModel du5 = new DepUserModel();
        du5.setDepId("dep2");
        du5.setDepUserId("du5");
        du5.setUserId("user1");
        depUserCol.add(du5);
    }

    public boolean deleteDep(String depId) {
        ArrayList<DepUserModel> tempCol = new ArrayList<>();
        for (DepUserModel du : this.depUserCol) {
            if (du.getDepId().equals(depId)) {
                tempCol.add(du);
            }
        }
        this.depUserCol.removeAll(tempCol);
        return true;
    }

    public boolean deleteUser(String userId) {
        ArrayList<DepUserModel> tempCol = new ArrayList<>();
        for (DepUserModel du : this.depUserCol) {
            if (du.getUserId().equals(userId)) {
                tempCol.add(du);
            }
        }
        this.depUserCol.removeAll(tempCol);
        return true;
    }

    public void showDepUsers(Dep dep) {
        for (DepUserModel du : this.depUserCol) {
            if (du.getDepId().equals(dep.getDepId())) {
                System.out.println("部门编号=" + dep.getDepId() + "下面拥有人员，其编号是：" + du.getUserId());
            }
        }
    }

    public void showUserDeps(User user) {
        for (DepUserModel du : this.depUserCol) {
            if (du.getUserId().equals(user.getUserId())) {
                System.out.println("人员编号=" + user.getUserId() + "属于部门编号是：" + du.getDepId());
            }
        }
    }

    //完成因人员调换部门引起的与部门的交互
    public boolean changeDep(String userId, String oldDepId, String newDepId) {
//        本示例不去实现了
        return false;
    }

    public boolean joinDep(Collection<String> colDepIds, Dep newDep) {
        return false;
    }
}
