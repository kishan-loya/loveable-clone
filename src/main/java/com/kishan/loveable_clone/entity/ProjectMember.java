package com.kishan.loveable_clone.entity;

import com.kishan.loveable_clone.enums.ProjectRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {

    ProjectMemberId projectMemberId;

    Project project;

    User user;

    ProjectRole role;

    User invitedBy;

    LocalDateTime invitedAt;

    LocalDateTime joinedAt;
}
