package com.kishan.loveable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsageLog {

    Long id;

    User user;

    Project project;

    String action;

    ChatSession chatSession;//added by me

    Integer tokensUsed;

    Integer durationMs;

    String metadata;//json of model and prompt used

    LocalDateTime createdAt;
}
