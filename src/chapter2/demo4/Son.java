package chapter2.demo4;

import java.util.Collection;
import java.util.HashMap;

public class Son extends Father {

    // 放大输入参数类型
    public Collection<String> doSomething(HashMap<String,String> map) {
        System.out.println("子类被执行");
        return map.values();
    }
    
    /*public static void main(String[] args) {
        Son son = new Son();
        son.doSomething(new HashMap<String,String>());
    }*/
}
