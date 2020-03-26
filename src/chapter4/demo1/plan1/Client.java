package chapter4.demo1.plan1;

public class Client {

    /**
     * 问题是我们把美女的定义定死了  必须满足脸蛋身材  气质
     * 但是有些人认为脸蛋和身材就是美女了   或者气质够了就是美女了  那么就需要拆分接口了  将接口细分
     * @param args
     */
    public static void main(String[] args) {
        IGoodBodyGirl reba = new PrettyGirl("热巴");
        AbstractSearcher searcher = new Searcher(reba);
        searcher.show();
        
        IGreatTemperamentGirl malaos = new PrettyGirl2("马老师");
        AbstractSearcher searcher2 = new Searcher(malaos);
        searcher2.show();
    }
}
