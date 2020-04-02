package chapter11.demo1.plan1;

public class BMWModel extends CarModel {

    @Override
    protected void start() {
        // TODO Auto-generated method stub
        System.out.println("宝马开启");
    }

    @Override
    protected void stop() {
        // TODO Auto-generated method stub
        System.out.println("宝马停下");
    }

    @Override
    protected void alarm() {
        // TODO Auto-generated method stub
        System.out.println("宝马响喇叭");
    }

    @Override
    protected void engineBoom() {
        // TODO Auto-generated method stub
        System.out.println("宝马引擎声");
    }

}
