package model.service.contract;

import model.bean.Contract;
import model.responsitory.contract.ContractResponsitory;
import model.responsitory.contract.ContractResponsitoryImpl;

import java.util.List;

public class ContractServiceImpl implements ContractService {
    private ContractResponsitory contractResponsitory = new ContractResponsitoryImpl();
    @Override
    public List<Contract> showAll() {
        return this.contractResponsitory.showAll();
    }

    @Override
    public boolean save(Contract contract) {
        return this.contractResponsitory.save(contract);
    }

    @Override
    public boolean update(int id, Contract contract) {
        return this.contractResponsitory.update(id,contract);
    }

    @Override
    public boolean delete(int id) {
        return contractResponsitory.delete(id);
    }

    @Override
    public Contract searchContract(String name) {
        return contractResponsitory.searchContract(name);
    }
}
