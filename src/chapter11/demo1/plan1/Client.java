package chapter11.demo1.plan1;

import java.util.ArrayList;

public class Client {


    /**
     *  我们组装了一辆车，满足了公司需求，但是汽车的动作执行顺序是要能够随意调整的啊
     * @param args
     */
    public static void main(String[] args) {
        
        /*ArrayList<String> sequence = new ArrayList<String>();
        BenzModel benz = new BenzModel();
        sequence.add("engineBoom");
        sequence.add("start");
        sequence.add("stop");
        
        benz.setSequence(sequence);
        benz.run();*/
        
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engineBoom");
        sequence.add("start");
        sequence.add("stop");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        CarModel carModel = benzBuilder.getCarModel();
        carModel.run();
        
        
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        CarModel carModel2 = bmwBuilder.getCarModel();
        carModel2.run();
    
    }
}
