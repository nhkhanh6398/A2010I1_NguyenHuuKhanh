package vn.codegym.repository.service;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.model.Service;

public interface ServiceRepository extends JpaRepository<Service, String> {
}
