package chapter5.demo1.plan1;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        
        List<Girl> listGirls = new ArrayList<Girl>();
        
        for(int i = 0; i < 20; i++) {
            listGirls.add(new Girl());
        }
        Teacher teacher = new Teacher();
        GroupLeader leader = new GroupLeader(listGirls);
        
        teacher.command(leader);
    }
}
