package vn.codegym.repository.role;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.codegym.model.Role;
import vn.codegym.model.User;

import java.util.Set;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Set<Role> findAllByUsers(User user);
}
