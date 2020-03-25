package chapter2.demo4;

import java.util.Collection;
import java.util.Map;

public class Father {

    public Collection<String> doSomething(Map<String,String> map) {
        System.out.println("父类被执行");
        return map.values();
    }
    
    
}
