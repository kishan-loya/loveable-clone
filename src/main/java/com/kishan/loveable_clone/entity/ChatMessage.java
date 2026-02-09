package com.kishan.loveable_clone.entity;

import com.kishan.loveable_clone.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    Long id;

    ChatSession chatSession;

    String content;

    MessageRole role;

    String toolCalls;//json array of tools called

    Integer tokensUsed;

    LocalDateTime createdAt;
}
