package com.Mediator中介者模式.广义的中介者模式;

/**
 * @ClassName User
 * @Description 人员类
 * @Author deus
 * @Data 2018/8/28 11:53
 * @Version 1.0
 **/
public class User {
    private String userId;
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public boolean deleteUser(){
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
        mediator.deleteUser(userId);
        return true;
    }
}
