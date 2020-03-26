package chapter6.demo1.plan1;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private final static List<IBook> bookList = new ArrayList<IBook>();
    
    static {
        // 换成打折了的书籍了
        bookList.add(new OffNovelBook("天龙八部",3200,"金庸"));
        bookList.add(new OffNovelBook("巴黎圣母院",5600,"雨果"));
        bookList.add(new OffNovelBook("悲惨世界",3500,"雨果"));
        bookList.add(new OffNovelBook("金瓶梅",4300,"兰陵笑笑生"));
        
        // 新增IComputerBook接口和ComputerBook实现类 
        bookList.add(new ComputerBook("Think In Java", 4300, "Burce Eckel", "编程语言"));
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
