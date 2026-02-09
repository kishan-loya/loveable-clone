package com.kishan.loveable_clone.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {
}
