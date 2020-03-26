package chapter3.demo1.plan1;


import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;

import junit.framework.TestCase;

public class Client extends TestCase{
    Mockery context = new JUnit4Mockery();
    
    public static void main(String[] args) {
        IDriver driver = new Driver();
        ICar bmw = new BMW();
        driver.drive(bmw);
        
        ICar benz = new Benz();
        driver.drive(benz);
        
    }
    @Test
    public void test1() {
       // 根据接口虚拟一个对象
       
       final ICar car = context.mock(ICar.class);
       
       IDriver driver = new Driver();
       // 内部类
       context.checking(new Expectations() {{
           oneOf(car).run();
       }});
       
       driver.drive(car);
    }
}
