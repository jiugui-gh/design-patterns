package chapter5.demo1.plan1;

public class Teacher {

    // 老师对学生发布命令，清一下女生
    // girl类不是teacher的朋友类  不符合迪米特原则
    public void command(GroupLeader groupLeader) {
        
        
        groupLeader.countGirls();
    }
}
