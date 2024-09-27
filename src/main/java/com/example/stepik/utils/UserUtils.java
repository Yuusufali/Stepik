package com.example.stepik.utils;

import com.example.stepik.entities.Users;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public final class UserUtils {

    private UserUtils() {}

    public static Users getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        if(principal instanceof Users appUser) {
            return appUser;
        } else {
            throw new IllegalArgumentException("Invalid userType, provided type = %s"
                    .formatted(authentication.getPrincipal().getClass()));
        }
    }
}