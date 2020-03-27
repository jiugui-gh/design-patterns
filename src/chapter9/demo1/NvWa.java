package chapter9.demo1;

public class NvWa {

    public static void main(String[] args) {
        FemaleFactory femaleFactory = new FemaleFactory();
        Human femaleYellowHuman = femaleFactory.createYellowHuman();
        femaleYellowHuman.getColor();
        femaleYellowHuman.getSex();
        femaleYellowHuman.talk();
        
        System.out.println();
        MaleFactory maleFactory = new MaleFactory();
        Human maleYellowHuman = maleFactory.createYellowHuman();
        maleYellowHuman.getColor();
        maleYellowHuman.getSex();
        maleYellowHuman.talk();
    }
}
