package chapter11.demo2;

public class Director {

    
    private AbstractBuilder builder = new ConcreteProduct();
    public Product getProduct() {
        
        builder.setPart();
        Product buildProduct = builder.buildProduct();
        return buildProduct;
    }
}
