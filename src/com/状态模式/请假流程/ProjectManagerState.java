package com.状态模式.请假流程;

import java.util.Scanner;

/**
 * @ClassName ProjectManagerState
 * @Description 项目经理的审核
 * @Author deus
 * @Data 2018/9/5 16:25
 * @Version 1.0
 **/
public class ProjectManagerState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine context) {
        //先创建业务数据
        LeaveRequestModel model = (LeaveRequestModel) context.getBusinessVO();
        System.out.println("项目经理审核中，请稍等。。。。。。");
        //模拟用户处理界面，通过控制台来读取数据
        System.out.println(model.getUser() + "申请从" + model.getBeginDate() + "开始请假" + model.getLeaveDays() + "天，" +
                "请项目经理审核（1是同意，2是不同意）");
        //读取从控制台输入的数据
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String result = "不同意";
            int num = scanner.nextInt();
            if (num == 1) {
                result = "同意";
            }
            model.setResult("项目经理审核结果是：" + result);

            if (num == 1) {
                //项目经理同意，但请假天数大于3天
                if (model.getLeaveDays() > 3) {
                    context.setState(new DepManagerState());
                    context.doWork();
                } else {
                    //3天内的请假，由项目经理做主
                    context.setState(new AuditOverState());
                    context.doWork();
                }
            } else {
                //项目经理不同意，转向审核结束状态
                context.setState(new AuditOverState());
                context.doWork();
            }
        }
    }
}
