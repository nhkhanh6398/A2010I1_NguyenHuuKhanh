package model.responsitory.contract;

import model.bean.Contract;
import model.responsitory.base.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContractResponsitoryImpl implements ContractResponsitory {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Contract> showAll() {
        List<Contract> contractList = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from contract");
            Contract contract = null;
            while (resultSet.next()){
                int id = resultSet.getInt("contract_id");
                String dayStart = resultSet.getString("contract_start_date");
                String dayEnd = resultSet.getString("contract_end_date");
                double deposit = resultSet.getDouble("contract_deposit");
                double total = resultSet.getDouble("contract_total_money");
                int idEmployee = resultSet.getInt("employee_id");
                int idCustomer = resultSet.getInt("customer_id");
                int idService = resultSet.getInt("service_id");
                contract = new Contract(id,dayStart,dayEnd,deposit,total,idCustomer,idService,idEmployee);
                contractList.add(contract);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return contractList;
    }

    @Override
    public boolean save(Contract contract) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("INSERT INTO `contract` (`contract_start_date`, `contract_end_date`, " +
                            "`contract_deposit`, `contract_total_money`, `employee_id`, `customer_id`, `service_id`) VALUES (?, ?,?,?, ?, ?,?)");
        preparedStatement.setString(1,contract.getDayStart());
        preparedStatement.setString(2,contract.getDayEnd());
        preparedStatement.setDouble(3,contract.getDeposit());
        preparedStatement.setDouble(4,contract.getTotal());
        preparedStatement.setInt(5,contract.getIdEmployee());
        preparedStatement.setInt(6,contract.getIdCustomer());
        preparedStatement.setInt(7,contract.getIdService());
        row =preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row>0;
    }

    @Override
    public boolean update(int id, Contract contract) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Contract searchContract(String name) {
        return null;
    }
}
