package com.kishan.loveable_clone.service;

import com.kishan.loveable_clone.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
