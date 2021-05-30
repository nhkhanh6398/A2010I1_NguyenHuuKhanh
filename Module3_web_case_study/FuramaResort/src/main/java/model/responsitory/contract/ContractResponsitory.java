package model.responsitory.contract;

import model.bean.Contract;

import java.util.List;

public interface ContractResponsitory {
    List<Contract> showAll();
    boolean save(Contract contract);
    boolean update(int id, Contract contract);
    boolean delete(int id);
    Contract searchContract(String name);
}
