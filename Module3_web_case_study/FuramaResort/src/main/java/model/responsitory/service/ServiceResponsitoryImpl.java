package model.responsitory.service;

import model.bean.Service;
import model.responsitory.base.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServiceResponsitoryImpl implements ServiceResponsitory {
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public List<Service> listAll() {
        List<Service> serviceList = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from service");
            Service service = null;
            while (resultSet.next()){
                service = new Service();
                service.setIdService(resultSet.getInt("service_id"));
                service.setNameService(resultSet.getString("service_name"));
                service.setAreaService(resultSet.getInt("service_area"));
                service.setCostService(resultSet.getDouble("service_cost"));
                service.setPeopleMaxService(resultSet.getInt("service_max_people"));
                service.setTypeRentService(resultSet.getString("rent_type_id"));

                serviceList.add(service);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return serviceList;
    }

    @Override
    public boolean save(Service service) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("INSERT INTO `db_furama`.`service` (`service_name`, `service_area`, `service_cost`, `service_max_people`, `rent_type_id`) " +
                            "VALUES (?,?, ?, ?, ?);");
            preparedStatement.setString(1,service.getNameService());
            preparedStatement.setDouble(2,service.getAreaService());
            preparedStatement.setDouble(3,service.getCostService());
            preparedStatement.setInt(4,service.getPeopleMaxService());
            preparedStatement.setString(5,service.getTypeRentService());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row>0;
    }

    @Override
    public boolean update(int id, Service service) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("UPDATE service " +
                            "SET `service_name` = ?, `service_area` = ?, `service_cost` = ?, `service_max_people` = ?," +
                            " `rent_type_id` = ? " +
                            "WHERE `service_id` = ?");
            preparedStatement.setString(1,service.getNameService());
            preparedStatement.setDouble(2,service.getAreaService());
            preparedStatement.setDouble(3,service.getCostService());
            preparedStatement.setInt(4,service.getPeopleMaxService());
            preparedStatement.setString(5,service.getTypeRentService());
            preparedStatement.setInt(6,service.getIdService());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row>0;
    }

    @Override
    public boolean delete(int id) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("delete\n" +
                            "from service\n" +
                            "where service_id = ?;");
            preparedStatement.setInt(1,id);
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row >0;
    }

    @Override
    public List<Service> seacrhService(String name) {
        List<Service> serviceList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("select * from service where service_name like ?");
            preparedStatement.setString(1, "%"+ name + "%");
            ResultSet rs = preparedStatement.executeQuery();
            Service service = null;
            while (rs.next()){
                int id = rs.getInt("service_id");
                String nameService = rs.getString("service_name");
                int area = rs.getInt("service_area");
                double cost = rs.getDouble("service_cost");
                int people = rs.getInt("service_max_people");
                String rent = rs.getString("rent_type_id");
                service = new Service(id,nameService,area,cost,people,rent);
                serviceList.add(service);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return serviceList;
    }
}
