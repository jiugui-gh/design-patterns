package chapter7.demo1;

public class Singleton2 {

    private static Singleton2 singleton = null;
    
    private Singleton2() {}
    
    // 懒汉式  要加同步
    public static synchronized Singleton2 getInstance() {
        if(singleton == null) {
            singleton = new Singleton2();
        }
        
        return singleton;
    }
}
