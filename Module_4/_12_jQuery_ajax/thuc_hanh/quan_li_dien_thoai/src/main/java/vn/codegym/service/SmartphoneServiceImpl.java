package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Smartphone;
import vn.codegym.repository.SmartphoneRepository;

import java.util.Optional;
@Service
public class SmartphoneServiceImpl implements SmartphoneService {

    @Autowired
    private SmartphoneRepository smartphoneRepository;

    @Override
    public Iterable<Smartphone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Integer id) {
        Optional<Smartphone> smartphone = smartphoneRepository.findById(id);
        if(smartphone == null){
            return null;
        }
        return smartphone;
    }

    @Override
    public Smartphone save(Smartphone phone) {
        return smartphoneRepository.save(phone);
    }

    @Override
    public Optional<Smartphone> remove(Integer id) {
        Optional<Smartphone> smartphone = findById(id);
        smartphoneRepository.deleteById(id);
        return smartphone;
    }
}
