package vn.codegym.model.service;

import vn.codegym.model.bean.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Product finById(int id);

    void update(int id, Product product);

    void remove(int id);
}
