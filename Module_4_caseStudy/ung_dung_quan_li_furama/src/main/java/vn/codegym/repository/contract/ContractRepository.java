package vn.codegym.repository.contract;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.model.Contract;

public interface ContractRepository extends JpaRepository<Contract, Integer> {
}
