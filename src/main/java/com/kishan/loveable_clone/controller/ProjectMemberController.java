package com.kishan.loveable_clone.controller;

import com.kishan.loveable_clone.dto.member.InviteMemberRequest;
import com.kishan.loveable_clone.dto.member.MemberResponse;
import com.kishan.loveable_clone.dto.member.UpdateRoleRequest;
import com.kishan.loveable_clone.service.ProjectMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects/{projectId}/members")
@RequiredArgsConstructor
public class ProjectMemberController {

    private final ProjectMemberService projectMemberService;

    @GetMapping
    public ResponseEntity<List<MemberResponse>> getProjectMembers(@PathVariable Long projectId) {
        Long userId = 1L; // This should be retrieved from the authenticated user's context
        return ResponseEntity.ok(projectMemberService.getProjectMembers(projectId, userId));
    }

    @PostMapping()
    public ResponseEntity<MemberResponse> inviteProjectMember(@PathVariable Long projectId,
                                                              @RequestBody InviteMemberRequest request) {
        Long userId = 1L; // This should be retrieved from the authenticated user's context
        return ResponseEntity.status(HttpStatus.CREATED).body(projectMemberService.inviteProjectMember(projectId, request, userId));
    }

    @PatchMapping("/{memberId}")
    public ResponseEntity<MemberResponse> updateProjectMemberRole(@PathVariable Long projectId,
                                                                  @PathVariable Long memberId,
                                                                  @RequestBody UpdateRoleRequest request) {
        Long userId = 1L; // This should be retrieved from the authenticated user's context
        return ResponseEntity.ok(projectMemberService.updateMemberRole(projectId, memberId, request, userId));
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<Void> removeProjectMember(@PathVariable Long projectId,
                                                    @PathVariable Long memberId) {
        Long userId = 1L; // This should be retrieved from the authenticated user's context
        projectMemberService.removeProjectMember(projectId, memberId, userId);
        return ResponseEntity.noContent().build();
    }
}
