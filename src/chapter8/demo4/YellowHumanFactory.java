package chapter8.demo4;

public class YellowHumanFactory extends AbstractHumanFactory {

    @Override
    public YellowHuman createHuman() {
        // TODO Auto-generated method stub
     // 可能有一些初始化的操作
        return new YellowHuman();
    }

}
