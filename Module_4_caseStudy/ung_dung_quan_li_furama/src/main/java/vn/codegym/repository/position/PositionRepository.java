package vn.codegym.repository.position;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.model.Position;

public interface PositionRepository extends JpaRepository<Position,Integer> {
}
