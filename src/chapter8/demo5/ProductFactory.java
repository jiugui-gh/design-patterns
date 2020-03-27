package chapter8.demo5;

import java.util.HashMap;
import java.util.Map;

import chapter8.demo2.ConcreateProduct1;
import chapter8.demo2.Product;

public class ProductFactory {

    private static final Map<String,Product> prMap = new HashMap<String,Product>();
    
    public static synchronized Product createProduct(String type) {
        Product product = null;
        if(prMap.containsKey(type)) {
            product =  prMap.get(type);
        }else {
            
            if(type.equals("Product1")) {
                product = new ConcreateProduct1();
            }else {
                product = new ConcreateProduct1();
            }
            prMap.put(type, product);
        }
        return product;
        
    }
}
