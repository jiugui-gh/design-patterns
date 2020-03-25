package chapter2.demo2;

public class AUG extends Rifle {

    public void zoomOut() {
        System.out.println("通过望远镜查看敌人。。。");
    }
    
    @Override
    public void shoot() {
        // TODO Auto-generated method stub
        System.out.println("AUG射击。。。");
    }
}
