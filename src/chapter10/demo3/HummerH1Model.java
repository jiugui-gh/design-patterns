package chapter10.demo3;

public class HummerH1Model extends HummerModel {

    @Override
    protected void start() {
        // TODO Auto-generated method stub
        System.out.println("悍马H1发动反。。。");
    }

    @Override
    protected void stop() {
        // TODO Auto-generated method stub
        System.out.println("悍马H1停车");
    }

    @Override
    protected void alarm() {
        // TODO Auto-generated method stub
        System.out.println("悍马H1鸣笛");
    }

    @Override
    protected void engineBoom() {
        // TODO Auto-generated method stub
        System.out.println("悍马H1引擎声音");
    }

}
