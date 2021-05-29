package model.responsitory.service;

import model.bean.Service;

import java.util.List;

public interface ServiceResponsitory {
    List<Service> listAll();
    boolean save(Service service);
    boolean update(int id, Service service);
    boolean delete(int id);
    List<Service> seacrhService(String name);
}
