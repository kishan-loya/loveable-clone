package com.kishan.loveable_clone.dto.subscription;

public record UsageTodayResponse(
        int tokensUsed,
        int tokensLimit,
        int previewsUsed,
        int previewsLimit
) {
}
