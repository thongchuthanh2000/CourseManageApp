package com.gaf.coursemanageapp.details;

import com.gaf.coursemanageapp.constant.SystemConstant;
import com.gaf.coursemanageapp.entity.Admin;
import com.gaf.coursemanageapp.utils.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

public class UserAdminDetails implements UserDetails {

    private Admin admin;

    public UserAdminDetails(Admin admin){
        this.admin = admin;
    }



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
//        Set<Role> roles = new HashSet<>();
//        roles.add(new Role((SystemConstant.ADMIN_ROLE)));
//
//        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//
//        for (Role role : roles) {
//            authorities.add(new SimpleGrantedAuthority(role.getRole()));
//        }
        return Collections.singleton(new SimpleGrantedAuthority(SystemConstant.ADMIN_ROLE));


//        return authorities;
    }

    @Override
    public String getPassword() {
        return admin.getPassword();
    }

    @Override
    public String getUsername() {
        return admin.getUserName();
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
