package chapter8.demo4;

public class NvWa {

    // 升级为多个工厂类    一个产品类对应一个工厂类   一半是操作不仅仅是new  初始化海会对对象进行一些初始值的操作  不同产品会有不同初始胡过程才这样用
    public static void main(String[] args) {
        
        System.out.println("---------生产白人-----------");
        WhiteHumanFactory whiteHumanFactory = new WhiteHumanFactory();
        WhiteHuman whiteHuman = whiteHumanFactory.createHuman();
        whiteHuman.talk();
        whiteHuman.getColor();
        
        System.out.println("---------生产黑人-----------");
        BlackHumanFactory blackHumanFactory = new BlackHumanFactory();
        BlackHuman blackHuman = blackHumanFactory.createHuman();
        blackHuman.talk();
        blackHuman.getColor();
        
        System.out.println("---------生产黄种人-----------");
        YellowHumanFactory yellowHumanFactory = new YellowHumanFactory();
        YellowHuman yellowHuman = yellowHumanFactory.createHuman();
        yellowHuman.talk();
        yellowHuman.getColor();
    }
}
