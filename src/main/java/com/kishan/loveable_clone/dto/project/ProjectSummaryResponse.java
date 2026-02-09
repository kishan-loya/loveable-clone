package com.kishan.loveable_clone.dto.project;

import java.time.LocalDateTime;

public record ProjectSummaryResponse(
    Long id,
    String name,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {
}
