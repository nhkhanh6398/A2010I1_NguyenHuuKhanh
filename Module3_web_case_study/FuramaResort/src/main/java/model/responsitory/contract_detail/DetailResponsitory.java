package model.responsitory.contract_detail;

import model.bean.Contract;
import model.bean.ContractDetail;

import java.util.List;

public interface DetailResponsitory {
    List<ContractDetail> showAll();
    boolean save(ContractDetail contractDetail);
}
