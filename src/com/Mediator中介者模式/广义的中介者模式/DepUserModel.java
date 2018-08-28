package com.Mediator中介者模式.广义的中介者模式;

/**
 * @ClassName DepUserModel
 * @Description TODO
 * @Author deus
 * @Data 2018/8/28 11:30
 * @Version 1.0
 **/
public class DepUserModel {
    private String depUserId;
    private String depId;
    private String userId;

    public String getDepUserId() {
        return depUserId;
    }

    public void setDepUserId(String depUserId) {
        this.depUserId = depUserId;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
