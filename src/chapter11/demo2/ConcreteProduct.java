package chapter11.demo2;

public class ConcreteProduct extends AbstractBuilder {

    private Product product = new Product();
    
    @Override
    public void setPart() {
        // TODO Auto-generated method stub
        /**
         * 产品类内部逻辑处理
         */
    }

    /**
     *  组件一个产品
     */
    @Override
    public Product buildProduct() {
        // TODO Auto-generated method stub
        return this.product;
    }

}
