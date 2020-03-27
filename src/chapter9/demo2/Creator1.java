package chapter9.demo2;

public class Creator1 extends AbstractCreator {

    @Override
    public AbstractProductA createProductA() {
        // TODO Auto-generated method stub
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        // TODO Auto-generated method stub
        return new ProductB1();
    }

}
