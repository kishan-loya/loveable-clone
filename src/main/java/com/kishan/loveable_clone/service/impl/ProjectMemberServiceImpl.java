package com.kishan.loveable_clone.service.impl;

import com.kishan.loveable_clone.dto.member.InviteMemberRequest;
import com.kishan.loveable_clone.dto.member.MemberResponse;
import com.kishan.loveable_clone.dto.member.UpdateRoleRequest;
import com.kishan.loveable_clone.service.ProjectMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {
    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteProjectMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateRoleRequest request, Long userId) {
        return null;
    }

    @Override
    public void removeProjectMember(Long projectId, Long memberId, Long userId) {

    }
}
