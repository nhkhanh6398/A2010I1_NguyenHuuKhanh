package model.service;

import model.bean.product;

import java.util.List;

public interface ProductService {
    List<product> findAll();
    boolean save(product product);
}
