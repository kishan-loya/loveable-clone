package com.kishan.loveable_clone.service.impl;

import com.kishan.loveable_clone.dto.project.ProjectRequest;
import com.kishan.loveable_clone.dto.project.ProjectResponse;
import com.kishan.loveable_clone.dto.project.ProjectSummaryResponse;
import com.kishan.loveable_clone.entity.Project;
import com.kishan.loveable_clone.entity.User;
import com.kishan.loveable_clone.mapper.ProjectMapper;
import com.kishan.loveable_clone.repository.ProjectRepository;
import com.kishan.loveable_clone.repository.UserRepository;
import com.kishan.loveable_clone.service.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Transactional
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        return projectMapper.toProjectSummaryResponseList(projectRepository.findAllAccessibleByUser(userId));
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        Project project = getAccessibleProjectByID(id, userId);
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        User owner = userRepository.findById(userId).orElseThrow();
        Project project = Project.builder()
                .name(request.name())
                .owner(owner)
                .isPublic(false)
                .build();
        project = projectRepository.save(project);
        return projectMapper.toProjectResponse(project) ;
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        Project project = getAccessibleProjectByID(id, userId);
        project.setName(request.name());
        project = projectRepository.save(project);
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public void softDelete(Long id, Long userId) {
        Project project = getAccessibleProjectByID(id, userId);
        if (!project.getOwner().getId().equals(userId)) {
            throw new RuntimeException("Only the owner can delete the project");
        }
        project.setDeletedAt(LocalDateTime.now());
        projectRepository.save(project);
    }

    private Project getAccessibleProjectByID(Long id, Long userId) {
        return projectRepository.findAccessibleProjectById(userId, id).orElseThrow();
    }
}
