package com.状态模式.请假流程;

/**
 * @ClassName AuditOverState
 * @Description 审核结束状态
 * @Author deus
 * @Data 2018/9/5 16:55
 * @Version 1.0
 **/
public class AuditOverState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine context) {
        //先创建业务数据
        LeaveRequestModel model = (LeaveRequestModel) context.getBusinessVO();
        System.out.println(model.getUser() + "你的请假申请已经结束，结果是：" + model.getResult());
    }
}
