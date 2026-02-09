package com.kishan.loveable_clone.service;

import com.kishan.loveable_clone.dto.subscription.PlanLimitResponse;
import com.kishan.loveable_clone.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
