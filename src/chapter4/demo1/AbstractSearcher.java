package chapter4.demo1;

public abstract class AbstractSearcher {

    protected IPrettyGirl prettyGirl;
    
    public AbstractSearcher(IPrettyGirl prettyGirl) {
        this.prettyGirl = prettyGirl;
    }
    
    // 搜索美女
    public abstract void show();
}
