//package com.application.grandslam.config;
//
//import com.application.grandslam.database.entities.User;
//
//public class UserPrincipal implements UserDetails {
//
//        private User user;
//
//        public UserPrincipal(User user) {
//            super();
//            this.user = user;
//        }
//
//        @Override
//        public Collection<? extends GrantedAuthority> getAuthorities() {
//            return Collections.singleton(new SimpleGrantedAuthority("USER"));
//        }
//
//        @Override
//        public String getPassword() {
//            return user.getPassword();
//        }
//
//        @Override
//        public String getUsername() {
//            return user.getEmail();
//        }
//
//        @Override
//        public boolean isAccountNonExpired() {
//            // TODO Auto-generated method stub
//            return true;
//        }
//
//        @Override
//        public boolean isAccountNonLocked() {
//            // TODO Auto-generated method stub
//            return true;
//        }
//
//        @Override
//        public boolean isCredentialsNonExpired() {
//            // TODO Auto-generated method stub
//            return true;
//        }
//
//        @Override
//        public boolean isEnabled() {
//            // TODO Auto-generated method stub
//            return true;
//        }
//
//    }
//}
