package interfaceTest;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Junit4Test extends TestCase{
    private Mockery context = new JUnit4Mockery();
    private IMathfun math = null;
    private TestJunit4 test = null;
    
    @Before
    public void setUp() throws Exception{
        super.setUp();
        math = context.mock(IMathfun.class);
        test = new TestJunit4(math);
        context.checking(new Expectations(){ 
              { 
                  exactly(1).of(math).abs(-20);will(returnValue(20)); 
              } 
        }); 
        
    }
    
    @After
    public void setDown(){
        
    }
    @Test
    public void test(){
        assertEquals(200, test.cal(-20));
    }
}
