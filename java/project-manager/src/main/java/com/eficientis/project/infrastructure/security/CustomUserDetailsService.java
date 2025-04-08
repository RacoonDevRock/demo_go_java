package com.eficientis.project.infrastructure.security;

import com.eficientis.project.users.domain.model.GlobalUser;
import com.eficientis.project.users.domain.repository.GlobalUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final GlobalUserRepository globalUserRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        GlobalUser user = globalUserRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(), user.getHashedPassword(), Collections.emptyList()
        );
    }
}

