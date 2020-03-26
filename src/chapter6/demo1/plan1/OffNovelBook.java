package chapter6.demo1.plan1;


public class OffNovelBook extends NovelBook {

    public OffNovelBook(String name, int price, String author) {
        super(name, price, author);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getPrice() {
        // TODO Auto-generated method stub
        // 原价
        int selfPrice = super.getPrice();
        int offPrice = 0;
        
        if(selfPrice > 4000) {
            offPrice = selfPrice * 90 / 100;
        }else {
            offPrice = selfPrice * 80 / 100;
        }
        return offPrice;
    }
}
