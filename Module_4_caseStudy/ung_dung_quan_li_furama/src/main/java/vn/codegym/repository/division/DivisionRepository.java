package vn.codegym.repository.division;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.model.Division;

public interface DivisionRepository extends JpaRepository<Division, Integer> {
}
