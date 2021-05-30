package model.responsitory.contract_detail;

import model.bean.ContractDetail;
import model.responsitory.base.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DetailResponsitoryImpl implements DetailResponsitory {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<ContractDetail> showAll() {
        List<ContractDetail> contractDetails = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from contract_detail");
            ContractDetail contractDetail = null;
            while (resultSet.next()){
                int id = resultSet.getInt("contract_detail_id");
                int idContract = resultSet.getInt("contract_id");
                int idAttachService = resultSet.getInt("attach_service_id");
                int quatily = resultSet.getInt("quatily");
                contractDetail = new ContractDetail(id,idContract,idAttachService,quatily);
                contractDetails.add(contractDetail);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return contractDetails;
    }

    @Override
    public boolean save(ContractDetail contractDetail) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().
                    prepareStatement("INSERT INTO `contract_detail` (`contract_id`, `attach_service_id`, `quatily`) VALUES ( ?,?, ?);\n");
            preparedStatement.setInt(1,contractDetail.getIdContract());
            preparedStatement.setInt(2,contractDetail.getIdServiceAttach());
            preparedStatement.setInt(3,contractDetail.getQuatily());
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row>0;
    }
}
