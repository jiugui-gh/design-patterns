package chapter8.demo4;


public class BlackHumanFactory extends AbstractHumanFactory {

    @Override
    public BlackHuman createHuman() {
        // TODO Auto-generated method stub
        // 可能有一些初始化的操作
        return new BlackHuman();
    }
}
