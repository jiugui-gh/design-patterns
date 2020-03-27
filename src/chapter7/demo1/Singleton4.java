package chapter7.demo1;

public class Singleton4 {

    private Singleton4() {
        System.out.println("调用构造函数");
    }
    static class Inner{
        static Singleton4 singleton = new Singleton4();
    }
    
    public static Singleton4 getInstance() {
        return Inner.singleton;
    }
    
    public static Singleton4 getInstance2() {
        return null;
    }
    public static void main(String[] args) {
        Singleton4.getInstance2();
        Singleton4.getInstance2();
        Singleton4.getInstance2();
        Singleton4.getInstance2();
    }
}
