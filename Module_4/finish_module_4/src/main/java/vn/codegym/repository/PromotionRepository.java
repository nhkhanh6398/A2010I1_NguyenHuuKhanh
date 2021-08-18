package vn.codegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.codegym.model.Promotion;

import java.util.List;

public interface PromotionRepository extends JpaRepository<Promotion, Integer> {
    @Query("select p \n" +
            "from Promotion p \n" +
            "where p.dayEnd like %:keyword%")
    List<Promotion> searchDayEnd(@Param("keyword") String dayend);


    List<Promotion> findAllByTitle(String title);

    List<Promotion> findAllByDayStart(String day);

    List<Promotion> findAllByDayEnd(String day);
}
