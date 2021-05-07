package model.repository.imp;

import model.bean.product;
import model.repository.ProductReposity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProductReposityImp implements ProductReposity {

    private static Map<Integer, product> producMap = new TreeMap<>();

    static {
        producMap.put(1,new product(25,"Sửa",15));
        producMap.put(2,new product(25,"Chuối",25));
        producMap.put(3,new product(25,"Trà",36));
        producMap.put(4,new product(25,"Nho",45));
    }

    @Override
    public List<product> findAll() {
        return new ArrayList<>(producMap.values());
    }

    @Override
    public boolean save(product product) {
        int idProducts = (int) (Math.random() * 1000);
        product.setId(idProducts);

        producMap.put(idProducts, product);

        return true;
    }
}
