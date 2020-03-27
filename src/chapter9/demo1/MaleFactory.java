package chapter9.demo1;

public class MaleFactory implements HumanFactory {

    @Override
    public Human createYellowHuman() {
        // TODO Auto-generated method stub
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Human createBlackHuman() {
        // TODO Auto-generated method stub
        return null;
    }

}
