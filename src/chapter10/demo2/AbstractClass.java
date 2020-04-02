package chapter10.demo2;

public abstract class AbstractClass {

    // 基本方法
    protected abstract void doSomething();
    // 基本方法
    protected abstract void doAnything();
    // 模板方法
    protected void templateMethod() {
        /**
         *  调用基本方法，完成相关逻辑
         */
        
        doSomething();
        
        doAnything();
    }
}
