//package com.example.end.security.details;
//
//import com.example.end.models.User;
//import com.example.end.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import com.example.end.security.details.AuthenticatedUser;
//
//
//@Service
//@RequiredArgsConstructor
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    private final UserRepository usersRepository;
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//
//        User user = usersRepository.findByEmail(email)
//                .orElseThrow(() -> new UsernameNotFoundException("User with email <" + email + "> not found"));
//
//        return new AuthenticatedUser(user);
//    }
//}
