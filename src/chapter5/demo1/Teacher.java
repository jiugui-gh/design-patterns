package chapter5.demo1;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    // 老师对学生发布命令，清一下女生
    // girl类不是teacher的朋友类  不符合迪米特原则
    public void command(GroupLeader groupLeader) {
        List<Girl> listGirls = new ArrayList<Girl>();
        
        for(int i = 0; i < 20; i++) {
            listGirls.add(new Girl());
        }
        
        groupLeader.countGirls(listGirls);
    }
}
