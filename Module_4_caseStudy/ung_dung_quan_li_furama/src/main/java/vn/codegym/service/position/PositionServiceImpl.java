package vn.codegym.service.position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Position;
import vn.codegym.repository.position.PositionRepository;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    PositionRepository positionRepository;
    @Override
    public List<Position> finall() {
        return positionRepository.findAll();
    }

    @Override
    public void save(Position position) {
    positionRepository.save(position);
    }

    @Override
    public void delete(Position position) {
    positionRepository.delete(position);
    }

    @Override
    public Position findById(Integer id) {
        return positionRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Position position) {
        positionRepository.save(position);
    }
}
