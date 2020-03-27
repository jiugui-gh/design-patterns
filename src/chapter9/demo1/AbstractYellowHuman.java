package chapter9.demo1;

public abstract class AbstractYellowHuman implements Human {

    @Override
    public void getColor() {
        // TODO Auto-generated method stub
        System.out.println("黄种人的皮肤是黄色的");
    }

    @Override
    public void talk() {
        // TODO Auto-generated method stub
        System.out.println("黄种人说话一半都是双字节");
    }

}
