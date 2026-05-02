package com.kishan.loveable_clone.entity;

import com.kishan.loveable_clone.enums.PreviewStatus;
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
public class Preview {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Project project;

    String namespace;

    String podName;

    String previewUrl;

    PreviewStatus status;

    LocalDateTime startedAt;

    LocalDateTime terminatedAt;

    LocalDateTime createdAt;
}
