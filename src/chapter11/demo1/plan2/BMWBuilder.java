package chapter11.demo1.plan2;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {

    private CarModel bmw = new BMWModel();
    @Override
    protected void setSequence(ArrayList<String> sequence) {
        // TODO Auto-generated method stub
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        // TODO Auto-generated method stub
        return this.bmw;
    }

}
