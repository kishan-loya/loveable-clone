package com.kishan.loveable_clone.entity;

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
public class ProjectFile {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Project project;

    String path;

    String minioObjectKey;

    LocalDateTime createdAt;

    LocalDateTime updatedAt;

    User createdBy;

    User updatedBy;
}
