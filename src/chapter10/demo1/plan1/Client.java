package chapter10.demo1.plan1;

public class Client {
    
    public static void main(String[] args) {
        
        HummerModel hummerH1Model = new HummerH1Model();
        hummerH1Model.run();
        
        HummerModel hummerH2Model = new HummerH2Model();
        hummerH2Model.run();
    }

}