package chapter8.demo2;

public class Client {

    public static void main(String[] args) {
        ConcreteCreator creator = new ConcreteCreator();
        ConcreateProduct1 createProduct = creator.createProduct(ConcreateProduct1.class);
        System.out.println(createProduct);
    }
}
