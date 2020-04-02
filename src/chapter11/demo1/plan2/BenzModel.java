package chapter11.demo1.plan2;

public class BenzModel extends CarModel {

    @Override
    protected void start() {
        // TODO Auto-generated method stub
        System.out.println("奔驰开启");
    }

    @Override
    protected void stop() {
        // TODO Auto-generated method stub
        System.out.println("奔驰停下");
    }

    @Override
    protected void alarm() {
        // TODO Auto-generated method stub
        System.out.println("奔驰响喇叭");
    }

    @Override
    protected void engineBoom() {
        // TODO Auto-generated method stub
        System.out.println("奔驰引擎声");
    }

}
