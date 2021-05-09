package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> productMap;
    static {
        productMap = new HashMap<>();
        productMap.put(1,new Product(1,"Chuối",50));
        productMap.put(2,new Product(2,"Bắp",30));
        productMap.put(3,new Product(3,"Xoài",20));
        productMap.put(4,new Product(4,"Bưởi",60));
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
    public Product findId(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public void delete(int id) {
        productMap.remove(id);
    }
}
