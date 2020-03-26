package chapter4.demo1;

public class Searcher extends AbstractSearcher {

    public Searcher(IPrettyGirl prettyGirl) {
        super(prettyGirl);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("--------美女信息如下------------------");
        super.prettyGirl.goodLooking();
        super.prettyGirl.niceFigure();
        super.prettyGirl.greatTemperament();
    }

}
