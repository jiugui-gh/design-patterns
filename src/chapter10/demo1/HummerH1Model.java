package chapter10.demo1;

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

    @Override
    protected void run() {
        // TODO Auto-generated method stub
        // 先发动汽车
        this.start();
        // 引擎开始轰鸣
        this.engineBoom();
        // 开始跑  然后按喇叭
        this.alarm();
        // 到达目的地停车
        this.stop();
    }

}
