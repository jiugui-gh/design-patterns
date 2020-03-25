package chapter2.demo5;

import java.util.TreeMap;

public class Client {

    public static void invoke() {
        // 如果子类范围比父类小  那么出现父类出现的地方，子类不一定能够出现
        Father father = new Father();
        father.doSomething(new TreeMap<String,String>());
        
        Son son = new Son();
        son.doSomething(new TreeMap<String,String>());
        
    
    }
    // 所以子类没有覆盖父类方法的前提下，子类方法被执行了
    public static void main(String[] args) {
        invoke();
    }
}
