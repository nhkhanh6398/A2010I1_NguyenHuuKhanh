package vn.codegym.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import vn.codegym.repository.role.RoleRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class MyUserDetail implements UserDetails {
//    @Autowired
//    private RoleRepository roleRepository;

    private User user;

    public MyUserDetail(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
//        Set<Role> roles = roleRepository.findAllByUsers(user);

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();

            for (Role role : user.getRoles()){
                System.out.println(role.getRoleName());
                grantedAuthorities.add(new SimpleGrantedAuthority(role.getRoleName()));

        }

        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
