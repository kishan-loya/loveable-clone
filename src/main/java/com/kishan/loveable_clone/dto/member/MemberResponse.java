package com.kishan.loveable_clone.dto.member;

import com.kishan.loveable_clone.enums.ProjectRole;

import java.time.LocalDateTime;

public record MemberResponse(
        Long userId,
        String name,
        String email,
        String avatarUrl,
        ProjectRole role,
        LocalDateTime invitedAt
) {
}
