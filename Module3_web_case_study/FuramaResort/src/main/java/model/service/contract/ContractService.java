package model.service.contract;

import model.bean.Contract;

import java.util.List;

public interface ContractService {
    List<Contract> showAll();
    boolean save(Contract contract);
    boolean update(int id, Contract contract);
    boolean delete(int id);
    Contract searchContract(String name);
}
