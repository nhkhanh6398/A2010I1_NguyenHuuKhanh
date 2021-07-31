package vn.codegym.service.position;

import vn.codegym.model.Position;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface PositionService {
    List<Position> finall();
    void save(Position position);
    void delete(Position position);
    Position findById(Integer id);
    void update(Position position);
}
