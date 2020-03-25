package chapter2.demo3;

import java.util.Collection;
import java.util.HashMap;

public class Father {

    public Collection<String> doSomething(HashMap<String,String> map) {
        System.out.println("父类被执行");
        return map.values();
    }
    
    
}
