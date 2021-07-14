package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Product;
import vn.codegym.repository.ProductRepository;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository repository;
    @Override
    public List<Product> findALl() {
        return repository.findAll();
    }

    @Override
    public void save(Product product) {
        repository.save(product);
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void update(Product product) {
        repository.save(product);
    }

    @Override
    public void remove(Product product) {
        repository.delete(product);
    }
}
