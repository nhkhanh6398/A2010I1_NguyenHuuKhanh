package vn.codegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByName(String name);
}
