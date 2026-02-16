package com.kishan.loveable_clone.service.impl;

import com.kishan.loveable_clone.dto.project.ProjectRequest;
import com.kishan.loveable_clone.dto.project.ProjectResponse;
import com.kishan.loveable_clone.dto.project.ProjectSummaryResponse;
import com.kishan.loveable_clone.entity.Project;
import com.kishan.loveable_clone.entity.User;
import com.kishan.loveable_clone.repository.ProjectRepository;
import com.kishan.loveable_clone.repository.UserRepository;
import com.kishan.loveable_clone.service.ProjectService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        return List.of();
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        User owner = userRepository.findById(userId).orElseThrow();
        Project project = Project.builder()
                .name(request.name())
                .owner(owner)
                .build();
        project = projectRepository.save(project);
        return null;
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
