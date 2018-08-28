package com.Mediator中介者模式.广义的中介者模式;

/**
 * @ClassName Dep
 * @Description 部门类
 * @Author deus
 * @Data 2018/8/28 11:26
 * @Version 1.0
 **/
public class Dep {
    private String depId;
    private String depName;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
    public boolean deleteDep(){
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
        mediator.deleteDep(depId);
        return true;
    }
}
