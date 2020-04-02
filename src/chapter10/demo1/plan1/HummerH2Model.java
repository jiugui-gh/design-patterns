package chapter10.demo1.plan1;

public class HummerH2Model extends HummerModel {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("悍马H2发动反。。。");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("悍马H2停车");
    }

    @Override
    public void alarm() {
        // TODO Auto-generated method stub
        System.out.println("悍马H2鸣笛");
    }

    /**
     *  发现两个实现类的run方法的实现是完全相同的,那么这个run方法的实现应该出现在抽象类上面
     */
    @Override
    public void engineBoom() {
        // TODO Auto-generated method stub
        System.out.println("悍马H2引擎声音");
    }


}
