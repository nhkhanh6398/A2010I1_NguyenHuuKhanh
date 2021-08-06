package vn.codegym.service.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import vn.codegym.model.Service;

public interface ServiceService {
    Page<Service> findAll(Pageable pageable);
    void save(Service service);
    void delete(String id);
    void update(Service service);
    Service findById(String id);
}
