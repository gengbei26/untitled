package com.状态模式.请假流程;

import java.util.Scanner;

/**
 * @ClassName DepManagerState
 * @Description 部门经理的审核
 * @Author deus
 * @Data 2018/9/5 16:50
 * @Version 1.0
 **/
public class DepManagerState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine context) {
        //先创建业务数据
        LeaveRequestModel model = (LeaveRequestModel) context.getBusinessVO();
        System.out.println("部门经理审核中，请稍等。。。。。。");
        //模拟用户处理界面，通过控制台来读取数据
        System.out.println(model.getUser() + "申请从" + model.getBeginDate() + "开始请假" + model.getLeaveDays() + "天，" +
                "请部门经理审核（1是同意，2是不同意）");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int num = scanner.nextInt();
            String result = "不同意";
            if (num == 1) {
                result = "同意";
            }
            model.setResult("部门经理审核结果是：" + result);
            //部门经理审核以后，直接转向审核结束状态
            context.setState(new AuditOverState());
            context.doWork();
        }

    }
}
