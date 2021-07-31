package vn.codegym.service.education;

import vn.codegym.model.EducationDegree;
import vn.codegym.model.Position;

import java.util.List;

public interface EducationService {
    List<EducationDegree> finall();
    void save(EducationDegree educationDegree);
    void delete(EducationDegree educationDegree);
    EducationDegree findById(Integer id);
    void update(EducationDegree educationDegree);
}
