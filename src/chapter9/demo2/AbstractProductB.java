package chapter9.demo2;

public abstract class AbstractProductB {
    
    // 每个产品都有的公共方法
    public void shareMethod() {}
    
    // 每个产品相同方法，不同实现
    public abstract void doSomething();
}
