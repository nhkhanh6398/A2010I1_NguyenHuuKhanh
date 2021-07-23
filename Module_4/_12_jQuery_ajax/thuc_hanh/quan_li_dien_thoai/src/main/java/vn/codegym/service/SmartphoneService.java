package vn.codegym.service;

import vn.codegym.model.Smartphone;

import java.util.Optional;

public interface SmartphoneService {
    Iterable<Smartphone> findAll();
    Optional<Smartphone> findById(Integer id);
    Smartphone save(Smartphone phone);
    Optional<Smartphone> remove(Integer id);
}
