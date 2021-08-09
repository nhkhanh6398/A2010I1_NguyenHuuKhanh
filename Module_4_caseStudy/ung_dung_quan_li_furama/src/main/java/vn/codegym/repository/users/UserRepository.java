package vn.codegym.repository.users;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String name);
}
