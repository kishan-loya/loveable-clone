package com.kishan.loveable_clone.controller;

import com.kishan.loveable_clone.dto.subscription.PlanLimitResponse;
import com.kishan.loveable_clone.dto.subscription.UsageTodayResponse;
import com.kishan.loveable_clone.service.UsageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usage")
@RequiredArgsConstructor
public class UsageController {

    private final UsageService usageService;

    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse> getTodayUsage() {
        Long userId = 1L; // TODO: Get from security context
        return ResponseEntity.ok(usageService.getTodayUsageOfUser(userId));
    }

    @GetMapping("limits")
    public ResponseEntity<PlanLimitResponse> getPlanLimits() {
        Long userId = 1L; // TODO: Get from security context
        return ResponseEntity.ok(usageService.getCurrentSubscriptionLimitsOfUser(userId));
    }
}
