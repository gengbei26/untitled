package com.Observer观察者模式.简单变形;

/**
 * @ClassName WaterQuality
 * @Description 具体的水质检测对象
 * @Author deus
 * @Data 2018/8/29 16:28
 * @Version 1.0
 **/
public class WaterQuality extends WaterQualitySubject {
    /**
     * @Author deus
     * @Description 污染的级别，0正常，1轻度污染，2中度污染，3高度污染
     * @Date 2018/8/29 16:29
     */
    private int polluteLevel=0;

    public void setPolluteLevel(int polluteLevel) {
        this.polluteLevel = polluteLevel;
        //此处不再调用父类的通知方法，而是调用自己的通知方法
        this.notifyWatchers();
    }

    @Override
    public int getPolluteLevel() {
        return this.polluteLevel;
    }
    /**
     * @Author deus
     * @Description 覆写抽象类中的抽象方法，达到按级别通知观察者
     * 推模式，将
     * @Date 2018/8/29 16:32
     */
    @Override
    public void notifyWatchers() {
        for(WatcherObserver watcher : super.observers){
            if(this.polluteLevel >=0){
                if("监测人员".equals(watcher.getJob())){
                    // 这里使用拉模式，将目标对象本身传递给观察者
                    watcher.update(this);
                }
                if(this.polluteLevel >= 1){
                    if("预警人员".equals(watcher.getJob())){
                        watcher.update(this);
                    }
                }
                if(this.polluteLevel >= 2){
                    if("监测部门领导".equals(watcher.getJob())){
                        watcher.update(this);
                    }
                }
            }
        }
    }
}
