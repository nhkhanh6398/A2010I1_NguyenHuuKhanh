package vn.codegym.service;

import vn.codegym.model.Promotion;

import java.util.List;

public interface PromotionService {
    List<Promotion> finAll();
    Promotion findById(Integer id);
    void save(Promotion promotion);

    void update(Promotion promotion);

    void delete(Integer id);
    List<Promotion> findAllByName(String title);
    List<Promotion> findAllByDayStart(String dayStart);
    List<Promotion> findAllByDayEnd(String dayEnd);
}
