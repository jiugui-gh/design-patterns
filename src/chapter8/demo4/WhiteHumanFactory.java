package chapter8.demo4;

public class WhiteHumanFactory extends AbstractHumanFactory {

    @Override
    public WhiteHuman createHuman() {
        // TODO Auto-generated method stub
     // 可能有一些初始化的操作
        return new WhiteHuman();
    }

}
