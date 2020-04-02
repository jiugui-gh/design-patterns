package chapter10.demo3;

public abstract class HummerModel {

    protected abstract void start();
    
    protected abstract void stop();
    // 喇叭会出声音
    protected abstract void alarm();
    // 引擎
    protected abstract void engineBoom();
    
    protected void run() {
        // 先发动汽车
        this.start();
        // 引擎开始轰鸣
        this.engineBoom();
        // 开始跑  然后按喇叭
        if(this.isAlarm()) {
            this.alarm();
        }
      
        // 到达目的地停车
        this.stop();
    }
    // 钩子方法
    protected boolean isAlarm() {
        return true;
    }
}
