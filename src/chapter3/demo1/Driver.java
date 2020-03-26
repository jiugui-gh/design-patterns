package chapter3.demo1;

public class Driver {

    // 司机的主要职责就是驾驶汽车
    public void drive(Benz benz) {
        benz.run();
    }
    
    public void drive(BMW bmw) {
        bmw.run();
    }
}
