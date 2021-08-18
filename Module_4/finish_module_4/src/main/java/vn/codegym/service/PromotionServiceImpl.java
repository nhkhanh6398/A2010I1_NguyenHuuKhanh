package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Promotion;
import vn.codegym.repository.PromotionRepository;

import java.util.List;
@Service
public class PromotionServiceImpl implements PromotionService {
    @Autowired
    PromotionRepository promotionRepository;
    @Override
    public List<Promotion> finAll() {
        return promotionRepository.findAll();
    }

    @Override
    public Promotion findById(Integer id) {
        return promotionRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Promotion promotion) {
    promotionRepository.save(promotion);
    }

    @Override
    public void update(Promotion promotion) {
    promotionRepository.save(promotion);
    }

    @Override
    public void delete(Integer id) {
    promotionRepository.deleteById(id);
    }

    @Override
    public List<Promotion> findAllByName(String title) {
        return promotionRepository.findAllByTitle(title);
    }

    @Override
    public List<Promotion> findAllByDayStart(String dayStart) {
        return promotionRepository.findAllByDayStart(dayStart);
    }

    @Override
    public List<Promotion> findAllByDayEnd(String dayEnd) {
        return promotionRepository.searchDayEnd(dayEnd);
    }
}
