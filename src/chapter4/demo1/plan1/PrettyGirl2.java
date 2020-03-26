package chapter4.demo1.plan1;

public class PrettyGirl2 implements IGreatTemperamentGirl {

    private String name;
    
    public PrettyGirl2(String name) {
        this.name = name;
    }


    @Override
    public void greatTemperament() {
        // TODO Auto-generated method stub
        System.out.println("身材非常好");
    }

}
