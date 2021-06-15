package vn.codegym.model.reponsitory;

import vn.codegym.model.bean.Product;

import java.util.List;

public interface ProductReponsitory {
    List<Product> findAll();

    void save(Product product);

    Product finById(int id);

    void update(int id, Product product);

    void remove(int id);
}
