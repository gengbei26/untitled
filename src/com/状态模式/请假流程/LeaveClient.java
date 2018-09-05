package com.状态模式.请假流程;

/**
 * @ClassName LeaveClient
 * @Description 请假流程
 * @Author deus
 * @Data 2018/9/5 16:58
 * @Version 1.0
 **/
public class LeaveClient {
    public static void main(String[] args) {
        LeaveRequestModel model = new LeaveRequestModel();
        model.setUser("那个谁");
        model.setBeginDate("2018/09/05");
        model.setLeaveDays(5);

        LeaveRequestContext context = new LeaveRequestContext();
        context.setBusinessVO(model);
        context.setState(new ProjectManagerState());
        context.doWork();
    }
}
