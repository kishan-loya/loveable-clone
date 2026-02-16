package com.kishan.loveable_clone.service.impl;

import com.kishan.loveable_clone.dto.auth.AuthResponse;
import com.kishan.loveable_clone.dto.auth.LoginRequest;
import com.kishan.loveable_clone.dto.auth.SignupRequest;
import com.kishan.loveable_clone.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
