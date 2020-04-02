package chapter11.demo1.plan1;

import java.util.ArrayList;

public abstract class CarModel {

    // 这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<String>();
    
    // 模型是启动开始跑了
    protected abstract void start();
    
    // 停下来
    protected abstract void stop();
    
    // 喇叭响
    protected abstract void alarm();
    
    // 引擎响
    protected abstract void engineBoom();
    
    // 跑起来
    final public void run() {
        
        for(int i = 0; i < sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            
            if(actionName.equalsIgnoreCase("start")) {
                this.start();
            }else if(actionName.equalsIgnoreCase("stop")) {
                this.stop();
            }else if(actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            }else if(actionName.equalsIgnoreCase("engineBoom")) {
                this.engineBoom();
            }
            
        }
    }
    
    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
