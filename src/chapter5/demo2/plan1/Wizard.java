package chapter5.demo2.plan1;

import java.util.Random;

public class Wizard {

    private Random rand = new Random(System.currentTimeMillis());

    // 第一步
    public int first() {
        System.out.println("执行第一步");
       return rand.nextInt(100); 
    }
    
    public int second() {
        System.out.println("执行第二步");
       return rand.nextInt(100); 
    }
    
    public int third() {
        System.out.println("执行第三步");
       return rand.nextInt(100); 
    }
}
