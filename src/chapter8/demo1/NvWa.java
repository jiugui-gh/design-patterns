package chapter8.demo1;

public class NvWa {

    public static void main(String[] args) {
        HumanFactory factory = new HumanFactory();
        
        System.out.println("---------生产白人-----------");
        WhiteHuman whiteHuman = factory.createHuman(WhiteHuman.class);
        whiteHuman.talk();
        whiteHuman.getColor();
        
        System.out.println("---------生产黑人-----------");
        BlackHuman blackHuman = factory.createHuman(BlackHuman.class);
        blackHuman.talk();
        blackHuman.getColor();
        
        System.out.println("---------生产黄种人-----------");
        YellowHuman yellowHuman = factory.createHuman(YellowHuman.class);
        yellowHuman.talk();
        yellowHuman.getColor();
    }
}
