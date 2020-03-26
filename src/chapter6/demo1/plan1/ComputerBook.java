package chapter6.demo1.plan1;

public class ComputerBook implements IComputerBook {

    private String name;
    private int price;
    private String author;
    private String scope;
    
    public ComputerBook(String name, int price, String author, String scope) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.scope = scope;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public int getPrice() {
        // TODO Auto-generated method stub
        return price;
    }

    @Override
    public String getAuthor() {
        // TODO Auto-generated method stub
        return author;
    }

    @Override
    public String getScope() {
        // TODO Auto-generated method stub
        return scope;
    }

}
