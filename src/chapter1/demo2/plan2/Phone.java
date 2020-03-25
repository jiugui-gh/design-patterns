package chapter1.demo2.plan2;

/**
 * 改用组合的方式未一个类实现两个接口，把两个职责融合在一个类中，虽然Phone类中包含了两个职责
 * 但是我们师面向接口编程的，对外公开的是接口而不是实现类
 * 类尽量做单一职责，而接口就一定要做单一职责
 * @author Pinkboy
 *
 */
public class Phone implements IConnectionManager, IDataTransfer {

    @Override
    public IDataTransfer chat(IConnectionManager connectionManager) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void dial(String phoneNumber) {
        // TODO Auto-generated method stub

    }

    @Override
    public void hangup() {
        // TODO Auto-generated method stub

    }

}
