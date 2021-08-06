package vn.codegym.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.repository.service.ServiceRepository;

@Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public Page<vn.codegym.model.Service> findAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public void save(vn.codegym.model.Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void delete(String id) {
        serviceRepository.deleteById(id);
    }



    @Override
    public void update(vn.codegym.model.Service service) {
        serviceRepository.save(service);
    }

    @Override
    public vn.codegym.model.Service findById(String id) {
        return serviceRepository.findById(id).orElse(null);
    }
}
