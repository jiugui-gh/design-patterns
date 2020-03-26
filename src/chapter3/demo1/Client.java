package chapter3.demo1;

public class Client {

    /**
     * 全部是依赖实现类   即依赖细节 耦合性极高    如果再加一个宝马类    那么Driver类需要再写一个重载driver方法    
     * @param args
     */
    public static void main(String[] args) {
        Driver driver = new Driver();
        Benz benz = new Benz();
        driver.drive(benz);
        
        
        BMW bmw = new BMW();
        driver.drive(bmw);
        
    }
}
