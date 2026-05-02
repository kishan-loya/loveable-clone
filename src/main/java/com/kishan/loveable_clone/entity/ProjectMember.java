package com.kishan.loveable_clone.entity;

import com.kishan.loveable_clone.enums.ProjectRole;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "project_members")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectMember {

    @EmbeddedId
    ProjectMemberId projectMemberId;

    Project project;

    User user;

    ProjectRole role;

    User invitedBy;

    LocalDateTime invitedAt;

    LocalDateTime joinedAt;
}
