package chapter10.demo1.plan1;

public abstract class HummerModel {

    public abstract void start();
    
    public abstract void stop();
    // 喇叭会出声音
    public abstract void alarm();
    // 引擎
    public abstract void engineBoom();
    
    public void run() {
        // 先发动汽车
        this.start();
        // 引擎开始轰鸣
        this.engineBoom();
        // 开始跑  然后按喇叭
        this.alarm();
        // 到达目的地停车
        this.stop();
    }
}
