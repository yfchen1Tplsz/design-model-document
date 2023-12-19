package com.projecty.client;

import com.projecty.memento.Caretaker;
import com.projecty.memento.Originator;

public class UseMementoDemo {


    /*
    备忘录模式，也成为快照模式，本质上是冗余存储，并且将存储-取出过程的职责做出分离，
    分为Originator发起人（状态变换的发起者），Memento（快照对象），Caretaker（快照、快照们的管理者，组合存储快照）
    */
    public static void useMemento() {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        //保存状态-设置备忘录
        originator.setStateInfo("StateInfo0");
        caretaker.setMemento(originator.createMemento());
//        System.out.println("备忘录设置状态为 ：" + caretaker.getMemento().getStateInfo());
        //改变状态：
        originator.setStateInfo("StateInfo1");
//        System.out.println("状态流转为 ：" + originator.getStateInfo());
        //取出状态-恢复备忘录
        originator.restoreMemento(caretaker.getMemento());
//        System.out.println("状态恢复到：" + originator.getStateInfo());

        //若将Caretaker设置为组合多个Memento（ List<Memento> ），即可记录每一个上一次状态，实现ctrl+z撤销功能
    }
}
