package model.responsitory.service.house;

import model.bean.House;
import model.responsitory.base.BaseRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HouseResponsitoryImpl implements HouseResponsitory {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<House> finAll() {
        return finAll();
    }

    @Override
    public boolean saveHouse(House house) {
        return false;
    }

    @Override
    public boolean updateHouse(int id, House house) {
        return false;
    }

    @Override
    public boolean deleteHouse(int id) {
        return false;
    }

    @Override
    public List<House> searchHouse(String name) {
        return null;
    }
}
