package vn.codegym.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.bean.Product;
import vn.codegym.model.reponsitory.ProductReponsitory;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductReponsitory productReponsitory;
    @Override
    public List<Product> findAll() {
        return productReponsitory.findAll();
    }

    @Override
    public void save(Product product) {
        productReponsitory.save(product);
    }

    @Override
    public Product finById(int id) {
        return productReponsitory.finById(id);
    }

    @Override
    public void update(int id, Product product) {
        productReponsitory.update(id,product);
    }

    @Override
    public void remove(int id) {
        productReponsitory.remove(id);
    }
}
