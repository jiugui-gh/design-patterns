package chapter10.demo1;

public abstract class HummerModel {

    protected abstract void start();
    
    protected abstract void stop();
    // 喇叭会出声音
    protected abstract void alarm();
    // 引擎
    protected abstract void engineBoom();
    
    protected abstract void run();
}
