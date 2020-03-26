package chapter6.demo1;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private final static List<IBook> bookList = new ArrayList<IBook>();
    
    static {
        bookList.add(new NovelBook("天龙八部",3200,"金庸"));
        bookList.add(new NovelBook("巴黎圣母院",5600,"雨果"));
        bookList.add(new NovelBook("悲惨世界",3500,"雨果"));
        bookList.add(new NovelBook("金瓶梅",4310,"兰陵笑笑生"));
    }
    
    /**
     *  如果书要打折了  或者要添加新的类别的书籍了怎么办(其他类别的书籍不光有IBook的特点)
     * @param args
     */
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        formatter.setMaximumFractionDigits(2);
        
        System.out.println("----------------卖出去的书记录表-----------------");
        
        for(IBook book : bookList) {
            System.out.println("书籍名称: " + book.getName() +"\t书籍作者: " +
                                book.getAuthor() + "\t书籍价格" + formatter.format(book.getPrice() / 100.0) + "元");
        }
    }
    
}
