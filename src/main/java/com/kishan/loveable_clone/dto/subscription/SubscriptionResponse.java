package com.kishan.loveable_clone.dto.subscription;

import java.time.LocalDateTime;

public record SubscriptionResponse(
        PlanResponse plan,
        String status,
        LocalDateTime periodEnd,
        Long tokensUsedThisPeriod
) {
}
