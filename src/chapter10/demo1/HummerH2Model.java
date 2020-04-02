package chapter10.demo1;

public class HummerH2Model extends HummerModel {

    @Override
    protected void start() {
        // TODO Auto-generated method stub
        System.out.println("悍马H2发动反。。。");
    }

    @Override
    protected void stop() {
        // TODO Auto-generated method stub
        System.out.println("悍马H2停车");
    }

    @Override
    protected void alarm() {
        // TODO Auto-generated method stub
        System.out.println("悍马H2鸣笛");
    }

    /**
     *  发现两个实现类的run方法的实现是完全相同的,那么这个run方法的实现应该出现在抽象类上面
     */
    @Override
    protected void engineBoom() {
        // TODO Auto-generated method stub
        System.out.println("悍马H2引擎声音");
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
