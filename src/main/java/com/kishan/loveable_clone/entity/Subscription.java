package com.kishan.loveable_clone.entity;

import com.kishan.loveable_clone.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {

    Long id;

    User user;

    Plan plan;

    SubscriptionStatus status;

    String stripeSubscriptionId;

    String stripeCustomerId;

    LocalDateTime currentPeriodStart;

    LocalDateTime currentPeriodEnd;

    Boolean cancelAtPeriodEnd;

    LocalDateTime createdAt;

    LocalDateTime updatedAt;

}
