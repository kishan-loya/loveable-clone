package com.kishan.loveable_clone.controller;

import com.kishan.loveable_clone.dto.auth.AuthResponse;
import com.kishan.loveable_clone.dto.auth.LoginRequest;
import com.kishan.loveable_clone.dto.auth.SignupRequest;
import com.kishan.loveable_clone.dto.auth.UserProfileResponse;
import com.kishan.loveable_clone.service.AuthService;
import com.kishan.loveable_clone.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthController {

    AuthService authService;
    UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signupRequest(@RequestBody SignupRequest request) {
        return ResponseEntity.ok(authService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> loginRequest(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile() {
        Long userId = 1L; // This should be retrieved from the authenticated user's context
        return ResponseEntity.ok(userService.getProfile(userId));
    }
}
