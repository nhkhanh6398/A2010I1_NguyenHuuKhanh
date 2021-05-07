package model.repository;

import model.bean.product;

import java.util.List;

public interface ProductReposity {

    List<product> findAll();
    boolean save(product product);
}
