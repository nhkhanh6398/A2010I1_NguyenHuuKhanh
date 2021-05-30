package model.service.contract_detail;

import model.bean.ContractDetail;

import java.util.List;

public interface DetailService {
    List<ContractDetail> showAll();
    boolean save(ContractDetail contractDetail);
}
