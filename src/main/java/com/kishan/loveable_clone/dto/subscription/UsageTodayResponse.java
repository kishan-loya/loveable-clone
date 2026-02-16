package com.kishan.loveable_clone.dto.subscription;

public record UsageTodayResponse(
        Integer tokensUsed,
        Integer tokensLimit,
        Integer previewsUsed,
        Integer previewsLimit
) {
}
