package vn.codegym.service.division;

import vn.codegym.model.Division;
import vn.codegym.model.Position;

import java.util.List;

public interface DivisionService {
    List<Division> finall();
    void save(Division division);
    void delete(Division division);
    Division findById(Integer id);
    void update(Division division);
}
