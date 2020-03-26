package chapter3.demo1.plan1;

public class Driver1 implements IDriver{

    private ICar car;
    
    public Driver1(ICar car) {
        this.car = car;
    }
    
    public void setCar(ICar car) {
        this.car = car;
    }
    
    public ICar getCar() {
        return car;
    }

    @Override
    public void drive(ICar car) {
        // TODO Auto-generated method stub
        car.run();
    }

}
