package com.cozastore.entity.keys;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cozastore.entity.RoleEntity;
import com.cozastore.entity.UserEntity;

import java.util.*;

public class CustomUserDetail extends UserEntity implements UserDetails {

    public CustomUserDetail(UserEntity user){
        super();
    }//ke thua lai model user





    @Override
    public String getUsername() {
        return super.getEmail();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return super.getPassword();
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