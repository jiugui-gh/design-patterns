package chapter7.demo1;

public class Singleton3 {

    // volatile防止指令重排列
    private static volatile Singleton3 singleton = null;
    
    private Singleton3() {}
    
    // 双重检查锁 
    public static Singleton3 getInstance() {
        if(singleton == null) {
            synchronized(Singleton3.class) {
                if(singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }
        
        return singleton;
    }
}
