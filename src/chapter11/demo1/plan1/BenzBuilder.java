package chapter11.demo1.plan1;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {

    private CarModel benz = new BenzModel();
    
    @Override
    protected void setSequence(ArrayList<String> sequence) {
        // TODO Auto-generated method stub
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        // TODO Auto-generated method stub
        return this.benz;
    }

}
