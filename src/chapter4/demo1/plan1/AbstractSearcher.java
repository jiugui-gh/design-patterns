package chapter4.demo1.plan1;

public abstract class AbstractSearcher {

    protected Object prettyGirl;
    
    public AbstractSearcher(IGoodBodyGirl prettyGirl) {
        this.prettyGirl = prettyGirl;
    }
    
    public AbstractSearcher(IGreatTemperamentGirl prettyGirl) {
        this.prettyGirl = prettyGirl;
    }
    
    // 搜索美女
    public abstract void show();
}
