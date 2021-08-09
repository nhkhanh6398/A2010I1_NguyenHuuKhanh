package vn.codegym.service.role;

import org.springframework.beans.factory.annotation.Autowired;
import vn.codegym.model.Role;
import vn.codegym.model.User;
import vn.codegym.repository.role.RoleRepository;

import java.util.Set;

public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;
    @Override
    public Set<Role> findAllByUsers(User user) {
        return roleRepository.findAllByUsers(user);
    }
}
