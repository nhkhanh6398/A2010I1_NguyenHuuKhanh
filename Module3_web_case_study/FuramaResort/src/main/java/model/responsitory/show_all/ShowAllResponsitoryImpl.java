package model.responsitory.show_all;

import model.bean.ShowAll;
import model.responsitory.base.BaseRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ShowAllResponsitoryImpl implements ShowAllResponsitory {
    private BaseRepository baseRepository = new BaseRepository();
    private static final String showAll ="select cus.customer_name, ct.contract_id,cd.contract_detail_id, asv.attach_service_name\n" +
            "from customer cus\n" +
            "inner join contract ct on ct.customer_id = cus.customer_id\n" +
            "inner join contract_detail cd on cd.contract_id = ct.contract_id\n" +
            "inner join attach_service asv on asv.attach_service_id = cd.attach_service_id\n" +
            "group by cus.customer_id;";
    @Override
    public List<ShowAll> showAll() {
        List<ShowAll> showAllList = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(showAll);
            ShowAll showAll = null;
            while (rs.next()){
                String name = rs.getString("customer_name");
                int idContract = rs.getInt("contract_id");
                int idDetail = rs.getInt("contract_detail_id");
                String serviceName = rs.getString("attach_service_name");
                showAll = new ShowAll(name,idContract,idDetail,serviceName);
                showAllList.add(showAll);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return showAllList;
    }
}
