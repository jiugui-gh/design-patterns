package chapter9.demo2;

public class Creator2 extends AbstractCreator {

    @Override
    public AbstractProductA createProductA() {
        // TODO Auto-generated method stub
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        // TODO Auto-generated method stub
        return new ProductB2();
    }

}
