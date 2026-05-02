package com.kishan.loveable_clone.repository;

import com.kishan.loveable_clone.entity.ProjectMember;
import com.kishan.loveable_clone.entity.ProjectMemberId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectMemberRepository extends JpaRepository<ProjectMember, ProjectMemberId> {
}
