package chapter2.demo3;

import java.util.HashMap;

public class Client {

    public static void invoke() {
        // 父类存在的地方子类就应该能存在   参数都是HashMap 而不是Map  子类范围比较大  要想执行子类那么必须覆盖父类的方法(而不是重载)
        Father father = new Father();
        father.doSomething(new HashMap<String,String>());
        
        Son son = new Son();
        son.doSomething(new HashMap<String,String>());
        
        
        /*Father father = new Father();
        father.doSomething(new TreeMap<String,String>()); //报红  
        
        Son son = new Son();
        son.doSomething(new TreeMap<String,String>());*/
    
    }
    
    public static void main(String[] args) {
        invoke();
    }
}
