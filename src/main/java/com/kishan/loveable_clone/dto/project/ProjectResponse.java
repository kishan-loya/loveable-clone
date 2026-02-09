package com.kishan.loveable_clone.dto.project;

import com.kishan.loveable_clone.dto.auth.UserProfileResponse;

import java.time.LocalDateTime;

public record ProjectResponse(
    Long id,
    String name,
    UserProfileResponse owner,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {
}
