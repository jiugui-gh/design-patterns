package chapter9.demo2;

public class Client {

    public static void main(String[] args) {
        Creator1 creator1 = new Creator1();
        
        creator1.createProductA();
        creator1.createProductB();
        
        
        Creator2 creator2 = new Creator2();
        
        creator2.createProductA();
        creator2.createProductB();
    }
}
