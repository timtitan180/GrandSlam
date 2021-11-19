package com.application.grandslam.security;//package com.application.grandslam.security;

//import com.application.grandslam.database.entities.User;
//import com.application.grandslam.database.entities.UserRole;
//import com.application.grandslam.database.repositories.UserRepository;
import com.application.grandslam.database.entities.Role;
import com.application.grandslam.database.entities.User;
import com.application.grandslam.database.repositories.UserRepository;
import com.application.grandslam.database.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;

import static java.util.Optional.ofNullable;

public class UserDetailsServiceImpl implements UserDetailsService {
    static Logger LOG = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
        User user = userRepository.findByEmail(email);
        if(user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        LOG.info("User is logged in");
        return new UserDetailsImpl(user);
    }

//

//
////    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
////
//////        User user = userRepository.findByEmail(email);
//////
//////        if (user == null) {
//////            LOG.info("User could not be found");
//////            throw new
//////                    UsernameNotFoundException("Username" + email + "" + "could not be found");
//////        }
////        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),accountIsEnabled,accountNonExpired
////        ,credentialsNonExpired,accountNonLocked,null);
////    }
//}

    /*For Authorities and Authorization*/
////        List<UserRole> userRoles = userRepository.getRoles();
//
//        boolean accountIsEnabled = true; // accountIsEnabled = user.isActive(); //
//        boolean accountNonExpired = true;
//        boolean
//                credentialsNonExpired = true;
//        boolean accountNonLocked = true;
//
//        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), accountIsEnabled, accountNonExpired, credentialsNonExpired, accountNonLocked,null);
//
//    }
//
    private List<GrantedAuthority> getAuthority(List<Role> roles) {
        List<GrantedAuthority> authorities = new ArrayList<>();

        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getRole()));
        }
        return authorities;
    }

}
//        ////// // always add the user role
//        authorities.add(new SimpleGrantedAuthority("USER"));
//        return authorities;
//
//    }
//
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public String getPassword() {
//        return null;
//    }
//
//    @Override
//    public String getUsername() {
//        return null;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return false;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return false;
//    }
//}
