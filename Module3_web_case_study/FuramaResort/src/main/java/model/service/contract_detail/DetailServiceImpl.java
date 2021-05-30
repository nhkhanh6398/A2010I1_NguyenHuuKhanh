package model.service.contract_detail;

import model.bean.ContractDetail;
import model.responsitory.contract_detail.DetailResponsitory;
import model.responsitory.contract_detail.DetailResponsitoryImpl;

import java.util.List;

public class DetailServiceImpl implements DetailService {
    private DetailResponsitory detailResponsitory = new DetailResponsitoryImpl();
    @Override
    public List<ContractDetail> showAll() {
        return detailResponsitory.showAll();
    }

    @Override
    public boolean save(ContractDetail contractDetail) {
        return detailResponsitory.save(contractDetail);
    }
}
