package chapter9.demo1;

public abstract class AbstractWhiteHuman implements Human{

    @Override
    public void getColor() {
        // TODO Auto-generated method stub
        System.out.println("白人的肤色是白色");
    }

    @Override
    public void talk() {
        // TODO Auto-generated method stub
        System.out.println("白人说话都是一个字节");
    }

}
