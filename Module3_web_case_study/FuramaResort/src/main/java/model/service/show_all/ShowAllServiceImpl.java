package model.service.show_all;

import model.bean.ShowAll;
import model.responsitory.show_all.ShowAllResponsitory;
import model.responsitory.show_all.ShowAllResponsitoryImpl;

import java.util.List;

public class ShowAllServiceImpl  implements ShowAllService{
    private ShowAllResponsitory showAllResponsitory = new ShowAllResponsitoryImpl();
    @Override
    public List<ShowAll> showAll() {
        return showAllResponsitory.showAll();
    }
}
