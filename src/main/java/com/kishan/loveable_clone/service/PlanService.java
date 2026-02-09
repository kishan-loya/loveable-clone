package com.kishan.loveable_clone.service;

import com.kishan.loveable_clone.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
