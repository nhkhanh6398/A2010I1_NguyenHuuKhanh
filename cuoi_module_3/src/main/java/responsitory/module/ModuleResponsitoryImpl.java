package responsitory.module;

import bean.TComplex;
import responsitory.base.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ModuleResponsitoryImpl implements ModuleResponsitory {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<TComplex> showList() {
        List<TComplex> tComplexList = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet rs = statement.executeQuery("select * from mat_bang order by area");
            TComplex tComplex = null;
            while (rs.next()){
                tComplex = new TComplex();
                tComplex.setId(rs.getString("id"));
                tComplex.setArea(rs.getInt("area"));
                tComplex.setStatus(rs.getString("trang_thai"));
                tComplex.setFloot(rs.getInt("tang"));
                tComplex.setTypeRoom(rs.getString("loai_van_phong"));
                tComplex.setDescribe(rs.getString("mo_ta"));
                tComplex.setRent(rs.getInt("gia"));
                tComplex.setDayStart(rs.getString("ngay_bat_dau"));
                tComplex.setDayEnd(rs.getString("ngay_ket_thuc"));
                tComplexList.add(tComplex);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return tComplexList;
    }

    @Override
    public boolean save(TComplex tComplex) {
        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into mat_bang value (?,?,?,?,?,?,?,?,?);");
            preparedStatement.setString(1,tComplex.getId());
            preparedStatement.setInt(2,tComplex.getArea());
            preparedStatement.setString(3,tComplex.getStatus());
            preparedStatement.setInt(4,tComplex.getFloot());
            preparedStatement.setString(5,tComplex.getTypeRoom());
            preparedStatement.setString(6,tComplex.getDescribe());
            preparedStatement.setInt(7,tComplex.getRent());
            preparedStatement.setString(8,tComplex.getDayStart());
            preparedStatement.setString(9,tComplex.getDayEnd());
            row = preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public boolean update(int id, TComplex tComplexcomplex) {
        return false;
    }


    @Override
    public boolean delete(String id) {

        int row = 0;
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement("delete\n" +
                    "from mat_bang\n" +
                    "where id like ?;");
            preparedStatement.setString(1, id);
            row = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public List<TComplex> seacrhCustomer(String typeRoom) {
        List<TComplex> tComplexList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from mat_bang where loai_van_phong like ?");
            preparedStatement.setString(1,"%"+ typeRoom + "%");
            ResultSet rs = preparedStatement.executeQuery();
            TComplex tComplex = null;
            while (rs.next()){
                String id = rs.getString("id");
                int area = rs.getInt("area");
                String status = rs.getString("trang_thai");
                int floot = rs.getInt("tang");
                String type = rs.getString("loai_van_phong");
                String mota = rs.getString("mo_ta");
                int rent = rs.getInt("gia");
                String start = rs.getString("ngay_bat_dau");
                String end = rs.getString("ngay_ket_thuc");
                tComplex = new TComplex(id,area,status,floot,type,mota,rent,start,end);
                tComplexList.add(tComplex);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
