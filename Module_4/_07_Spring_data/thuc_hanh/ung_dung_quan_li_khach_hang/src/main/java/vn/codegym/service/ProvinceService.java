package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.Province;
@Service
public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
