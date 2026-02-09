package com.kishan.loveable_clone.controller;

import com.kishan.loveable_clone.dto.subscription.*;
import com.kishan.loveable_clone.service.PlanService;
import com.kishan.loveable_clone.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BillingController {

    private final SubscriptionService subscriptionService;
    private final PlanService planService;

    @GetMapping("/api/plans")
    public ResponseEntity<List<PlanResponse>> getAllPlans() {
        return ResponseEntity.ok(planService.getAllActivePlans());
    }

    @GetMapping("/api/me/subscription")
    public ResponseEntity<SubscriptionResponse> getMySubscription() {
        Long userId = 1L; // TODO: Get from security context
        return ResponseEntity.ok(subscriptionService.getCurrentUserSubscription(userId));
    }

    @PostMapping("api/stripe/checkout")
    public ResponseEntity<CheckoutResponse> createCheckoutResponse(@RequestBody CheckoutRequest request) {
        Long userId = 1L; // TODO: Get from security context
        return ResponseEntity.ok(subscriptionService.createCheckoutSession(request, userId));
    }

    @PostMapping("api/stripe/portal")
    public ResponseEntity<PortalResponse> openCustomerPortal() {
        Long userId = 1L; // TODO: Get from security context
        return ResponseEntity.ok(subscriptionService.openCustomerPortal(userId));
    }
}
