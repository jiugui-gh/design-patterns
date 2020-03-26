package chapter4.demo1.plan1;

public class PrettyGirl implements IGreatTemperamentGirl,IGoodBodyGirl {

    private String name;
    
    public PrettyGirl(String name) {
        this.name = name;
    }
    @Override
    public void goodLooking() {
        // TODO Auto-generated method stub
        System.out.println("脸蛋漂亮");
    }

    @Override
    public void niceFigure() {
        // TODO Auto-generated method stub
        System.out.println("气质非常好");
    }

    @Override
    public void greatTemperament() {
        // TODO Auto-generated method stub
        System.out.println("身材非常好");
    }

}
