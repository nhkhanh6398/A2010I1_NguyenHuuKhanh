package model.service.imp;

import model.bean.product;
import model.repository.ProductReposity;
import model.repository.imp.ProductReposityImp;
import model.service.ProductService;

import java.util.List;

public class ProductServiceImp implements ProductService {
private ProductReposity productReposity = new ProductReposityImp();

    @Override
    public List<product> findAll() {
        return this.productReposity.findAll();
    }

    @Override
    public boolean save(product product) {
        if (product.getName().matches("[A-Za-z ]+")) {
            return this.productReposity.save(product);
        }
        return false;
    }
}
