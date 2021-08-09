package vn.codegym.service.role;

import vn.codegym.model.Role;
import vn.codegym.model.User;

import java.util.Set;

public interface RoleService {
    Set<Role> findAllByUsers(User user);
}
