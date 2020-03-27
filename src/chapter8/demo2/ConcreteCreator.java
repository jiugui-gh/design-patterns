package chapter8.demo2;

public class ConcreteCreator extends Creator {

    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        // TODO Auto-generated method stub
        T newInstance = null;
        try {
            newInstance = c.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return newInstance;
    }

}
