package chapter8.demo2;

public abstract class Creator {

    // 创建一个产品对象
    public abstract <T extends Product> T createProduct(Class<T> c);
}
