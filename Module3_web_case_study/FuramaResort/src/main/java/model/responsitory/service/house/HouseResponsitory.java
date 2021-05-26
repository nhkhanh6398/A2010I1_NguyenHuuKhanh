package model.responsitory.service.house;

import model.bean.House;

import java.util.List;

public interface HouseResponsitory {
    List<House> finAll();
    boolean saveHouse(House house);
    boolean updateHouse(int id, House house);
    boolean deleteHouse(int id);
    List<House> searchHouse(String name);
}
