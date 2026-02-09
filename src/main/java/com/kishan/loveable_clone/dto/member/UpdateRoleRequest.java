package com.kishan.loveable_clone.dto.member;

import com.kishan.loveable_clone.enums.ProjectRole;

public record UpdateRoleRequest(
        ProjectRole role
) {
}
