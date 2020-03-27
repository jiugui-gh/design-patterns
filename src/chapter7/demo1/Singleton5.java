package chapter7.demo1;

public class Singleton5 {

    private Singleton5() {
        System.out.println("调用构造函数");
    }
    
    static enum Singleton{
        INSTANCE;
        private Singleton5 obj;
        
        private Singleton() {
            obj = new Singleton5();
        }
        
        public Singleton5 getInstance() {
            return obj;
        }
    }
    
    public static Singleton5 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }
    
    public static void main(String[] args) {
        Singleton5.getInstance();
        Singleton5.getInstance();
        Singleton5.getInstance();
        Singleton5.getInstance();
    }
}
