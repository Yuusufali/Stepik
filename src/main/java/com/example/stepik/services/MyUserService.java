package com.example.stepik.services;

import com.example.stepik.entities.Users;
import com.example.stepik.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserService implements UserDetailsService {

    private final UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Users user = usersRepository.findAllByEmail(email);
        if(user==null){
            throw new UsernameNotFoundException("UserNotFound");
        }
        return usersRepository.findAllByEmail(email);
    }
}
