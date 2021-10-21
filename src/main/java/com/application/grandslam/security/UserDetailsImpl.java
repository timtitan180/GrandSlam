//package com.application.grandslam.security;
//
//import org.springframework.security.core.userdetails.UserDetails;
//
//import com.application.grandslam.database.entities.User;
//import com.application.grandslam.database.entities.UserRole;
//import com.application.grandslam.database.repositories.UserRepository;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//import java.util.logging.Logger;
//
//public class UserDetailsImpl implements UserDetails {
//    public final Logger LOG = (Logger) LoggerFactory.getLogger(UserDetailsServiceImpl.class);
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public org.springframework.security.core.userdetails.User loadUserByEmail(String email) throws UsernameNotFoundException {
//
//        User user = userRepository.findByEmail(email);
//
//        if (user == null) {
//            throw new UsernameNotFoundException("Email '" + email + "' not found in database");
//        }
//
//        List<UserRole> userRoles = userRepository.getUserRoles(user.getId());
//        // check the account status
//        boolean accountIsEnabled = true;
//        //accountIsEnabled = user.isActive();
//
//        // spring security configs
//        boolean accountNonExpired = true;
//        boolean credentialsNonExpired = true;
//        boolean accountNonLocked = true;
//
//        // setup user roles
//        // List<Permission> permissions = userDao.getPermissionsByEmail(username);
//        //Collection<? extends GrantedAuthority> springRoles = buildGrantAuthorities(permissions);
//        Collection<? extends GrantedAuthority> springRoles = buildGrantAuthorities(userRoles);
//
//        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), accountIsEnabled, accountNonExpired, credentialsNonExpired, accountNonLocked, springRoles);
//    }
//
//    //	private Collection<? extends GrantedAuthority> buildGrantAuthorities(List<Permission> permissions) {
////		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
////		for (Permission permission : permissions) {
////			authorities.add(new SimpleGrantedAuthority(permission.getName()));
////		}
////
////		return authorities;
////	}
//
//    private Collection<? extends GrantedAuthority> buildGrantAuthorities(List<UserRole> userRoles) {
//        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//
//        for (UserRole role : userRoles) {
//            authorities.add(new SimpleGrantedAuthority(role.getRole().toString()));
//        }
//
//        // always add the user role
//        authorities.add(new SimpleGrantedAuthority("PLAYER"));
//
//        return authorities;
//    }
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