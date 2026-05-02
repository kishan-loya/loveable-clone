package com.kishan.loveable_clone.entity;

import com.kishan.loveable_clone.enums.MessageRole;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    ChatSession chatSession;

    String content;

    MessageRole role;

    String toolCalls;//json array of tools called

    Integer tokensUsed;

    LocalDateTime createdAt;
}
