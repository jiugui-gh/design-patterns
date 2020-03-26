package chapter5.demo1.plan1;

import java.util.List;

public class GroupLeader {

    private List<Girl> listGirls;
    
    public GroupLeader(List<Girl> listGirls) {
        // TODO Auto-generated constructor stub
        this.listGirls = listGirls;
    }

    public void countGirls() {
        // TODO Auto-generated method stub
        System.out.println("女生的数量是" + listGirls.size());
    }

}
