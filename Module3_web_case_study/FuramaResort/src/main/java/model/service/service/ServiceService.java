package model.service.service;

import model.bean.Employee;
import model.bean.Service;

import java.util.List;

public interface ServiceService {
    List<Service> listAll();
    boolean save(Service service);
    boolean update(int id, Service service);
    boolean delete(int id);
    Service showByIdService(int id);
    List<Service> seacrhService(String name);
}
