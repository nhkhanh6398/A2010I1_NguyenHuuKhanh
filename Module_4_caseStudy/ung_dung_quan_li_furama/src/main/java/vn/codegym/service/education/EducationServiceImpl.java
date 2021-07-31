package vn.codegym.service.education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.EducationDegree;
import vn.codegym.repository.education.EducationRepository;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService {
    @Autowired
    EducationRepository educationRepository;
    @Override
    public List<EducationDegree> finall() {
        return educationRepository.findAll();
    }

    @Override
    public void save(EducationDegree educationDegree) {
        educationRepository.save(educationDegree);
    }

    @Override
    public void delete(EducationDegree educationDegree) {
        educationRepository.delete(educationDegree);
    }

    @Override
    public EducationDegree findById(Integer id) {
        return educationRepository.findById(id).orElse(null);
    }

    @Override
    public void update(EducationDegree educationDegree) {
        educationRepository.save(educationDegree);
    }
}
