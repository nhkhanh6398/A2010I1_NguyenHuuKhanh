package vn.codegym.model.reponsitory;

import org.springframework.stereotype.Repository;
import vn.codegym.model.bean.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductReponsitoryImpl implements ProductReponsitory {
    private static Map<Integer, Product> productMap;
    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1,"chuối",50));
        productMap.put(2, new Product(2,"cafe",50));
        productMap.put(3, new Product(3,"trà sữa",50));
        productMap.put(4, new Product(4,"coca",50));
        productMap.put(5, new Product(5,"pepsi",50));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public Product finById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }
}
