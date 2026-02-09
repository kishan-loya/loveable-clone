package com.kishan.loveable_clone.service;

import com.kishan.loveable_clone.dto.member.InviteMemberRequest;
import com.kishan.loveable_clone.dto.member.MemberResponse;
import com.kishan.loveable_clone.dto.member.UpdateRoleRequest;

import java.util.List;

public interface ProjectMemberService {

    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteProjectMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateRoleRequest request, Long userId);

    void removeProjectMember(Long projectId, Long memberId, Long userId);
}
