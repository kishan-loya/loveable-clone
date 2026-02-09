package com.kishan.loveable_clone.service;

import com.kishan.loveable_clone.dto.subscription.CheckoutRequest;
import com.kishan.loveable_clone.dto.subscription.CheckoutResponse;
import com.kishan.loveable_clone.dto.subscription.PortalResponse;
import com.kishan.loveable_clone.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentUserSubscription(Long userId);

    CheckoutResponse createCheckoutSession(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
