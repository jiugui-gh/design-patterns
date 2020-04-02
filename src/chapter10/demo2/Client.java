package chapter10.demo2;

public class Client {

    public static void main(String[] args) {
        
        AbstractClass class1 = new ConcreteClass1();
        class1.templateMethod();
        
        AbstractClass class2 = new ConcreteClass2();
        class2.templateMethod();
    }
}
