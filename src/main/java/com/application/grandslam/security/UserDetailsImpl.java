package com.application.grandslam.security;

import com.application.grandslam.database.entities.Role;
import com.application.grandslam.forms.LoginForm;
import org.springframework.security.core.userdetails.UserDetails;

import com.application.grandslam.database.entities.User;
import com.application.grandslam.database.repositories.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

public class UserDetailsImpl implements UserDetails {

    public final Logger LOG = (Logger) LoggerFactory.getLogger(UserDetailsImpl.class);

    private User user;

    UserDetailsImpl(User user) {
        this.user = user;
    }
    private Collection<? extends GrantedAuthority> buildGrantAuthorities(Role role) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        role = new Role();

        authorities.add(new SimpleGrantedAuthority(role.getRole().toString()));


        // always add the user role
        authorities.add(new SimpleGrantedAuthority("USER"));

        return authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}