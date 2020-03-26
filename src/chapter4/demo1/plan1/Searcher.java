package chapter4.demo1.plan1;

public class Searcher extends AbstractSearcher {

    

    public Searcher(IGoodBodyGirl prettyGirl) {
        super(prettyGirl);
        // TODO Auto-generated constructor stub
    }
    
    public Searcher(IGreatTemperamentGirl prettyGirl) {
        super(prettyGirl);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("--------美女信息如下------------------");
       /* super.prettyGirl.goodLooking();
        super.prettyGirl.niceFigure();
        super.prettyGirl.greatTemperament();*/
        
        if(super.prettyGirl instanceof IGreatTemperamentGirl) {
            IGreatTemperamentGirl girl =  (IGreatTemperamentGirl)super.prettyGirl;
            girl.greatTemperament();
           
        }
        
        if(super.prettyGirl instanceof IGoodBodyGirl) {
            IGoodBodyGirl girl =  (IGoodBodyGirl)super.prettyGirl;
            girl.niceFigure();
            girl.goodLooking();
           
        }
    }

}
