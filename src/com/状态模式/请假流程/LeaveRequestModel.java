package com.状态模式.请假流程;

/**
 * @ClassName LeaveRequestModel
 * @Description 业务数据
 * @Author deus
 * @Data 2018/9/5 15:36
 * @Version 1.0
 **/
public class LeaveRequestModel {
    //请假人
    private String user;
    //请假时间
    private String beginDate;
    //请假天数
    private int leaveDays;
    //审核结果
    private String result;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
