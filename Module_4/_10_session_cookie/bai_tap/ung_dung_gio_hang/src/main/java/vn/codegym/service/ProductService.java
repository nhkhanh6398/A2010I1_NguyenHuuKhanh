package vn.codegym.service;

import vn.codegym.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findALl();

    void save(Product product);
    Product findById(int id);
    void update(Product product);
    void remove(Product product);
}
