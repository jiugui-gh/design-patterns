package chapter8.demo3;

public class NvWa {

    // 简单工厂   直接不需要继承抽象类  然后用静态方法去调用   方法内容没有什么变化
    public static void main(String[] args) {
        
        System.out.println("---------生产白人-----------");
        WhiteHuman whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.talk();
        whiteHuman.getColor();
        
        System.out.println("---------生产黑人-----------");
        BlackHuman blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.talk();
        blackHuman.getColor();
        
        System.out.println("---------生产黄种人-----------");
        YellowHuman yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.talk();
        yellowHuman.getColor();
    }
}
