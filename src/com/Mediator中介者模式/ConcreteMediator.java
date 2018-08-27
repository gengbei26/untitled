package com.Mediator中介者模式;

/**
 * @ClassName ConcreteMediator
 * @Description TODO
 * @Author deus
 * @Data 2018/8/27 16:32
 * @Version 1.0
 **/
public class ConcreteMediator implements Mediator {
    @Override
    public void changed(Colleague colleague) {

    }
    private CDDriver_Colleague colleagueA;
    private CPU_Colleague colleagueB;
    public void setConcreteColleagueA(CDDriver_Colleague colleague){
         this.colleagueA = colleague;
    }
    public void setConcreteColleagueB(CPU_Colleague colleague){
        this.colleagueB = colleague;
    }
}
