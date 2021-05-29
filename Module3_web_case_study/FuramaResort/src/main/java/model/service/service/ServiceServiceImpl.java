package model.service.service;

import model.bean.Service;
import model.responsitory.base.BaseRepository;
import model.responsitory.service.ServiceResponsitory;
import model.responsitory.service.ServiceResponsitoryImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ServiceServiceImpl implements ServiceService {
    private ServiceResponsitory serviceResponsitory = new ServiceResponsitoryImpl();
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Service> listAll() {
        return this.serviceResponsitory.listAll();
    }

    @Override
    public boolean save(Service service) {
        return this.serviceResponsitory.save(service);
    }

    @Override
    public boolean update(int id, Service service) {
        return this.serviceResponsitory.update(id, service);
    }

    @Override
    public boolean delete(int id) {
        return this.serviceResponsitory.delete(id);
    }

    @Override
    public Service showByIdService(int id) {
        Service service = null;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("select * from service where service_id = ?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String nameService = rs.getString("service_name");
                int area = rs.getInt("service_area");
                double cost = rs.getDouble("service_cost");
                int people = rs.getInt("service_max_people");
                String rent = rs.getString("rent_type_id");
                service = new Service(nameService,area,cost,people,rent);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return service;
    }

    @Override
    public List<Service> seacrhService(String name) {
        return this.serviceResponsitory.seacrhService(name);
    }
}
