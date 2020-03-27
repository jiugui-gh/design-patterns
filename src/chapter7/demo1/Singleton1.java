package chapter7.demo1;

public class Singleton1 {

    // 饿汉式
    private static final Singleton1 SINGTLEON = new Singleton1();
    
    private Singleton1() {}
    
    // 返回对象
    public static Singleton1 getInstance() {
        return SINGTLEON;
    }
    
    // 类中的方法尽量是静态的
    public static void doSomething() {
        
    }
}
