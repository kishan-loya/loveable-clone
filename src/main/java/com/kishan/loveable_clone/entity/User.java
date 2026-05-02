package com.kishan.loveable_clone.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

     String email;

     String passwordHash;

     String name;

     String avatarUrl;

     @CreationTimestamp
     LocalDateTime createdAt;

     @UpdateTimestamp
     LocalDateTime updatedAt;

     LocalDateTime deletedAt;
}
