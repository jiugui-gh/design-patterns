package chapter11.demo1.plan2;

import java.util.ArrayList;

public class Director {

    private ArrayList<String> sequence = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();
    
    public CarModel getABenzModel() {
        
        // 清理场景
        this.sequence.clear();
        // 设置执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        
        return this.benzBuilder.getCarModel();
    }
    
    public CarModel getBBenzModel() {
        
        // 清理场景
        this.sequence.clear();
        // 设置执行顺序
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        
        return this.benzBuilder.getCarModel();
    }
    
    public CarModel getABMWModel() {
        
        // 清理场景
        this.sequence.clear();
        // 设置执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        
        return this.bmwBuilder.getCarModel();
    }
    
    public CarModel getBBMWModel() {
        
        // 清理场景
        this.sequence.clear();
        // 设置执行顺序
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        
        return this.bmwBuilder.getCarModel();
    }
}
 