package com.kishan.loveable_clone.mapper;

import com.kishan.loveable_clone.dto.project.ProjectResponse;
import com.kishan.loveable_clone.dto.project.ProjectSummaryResponse;
import com.kishan.loveable_clone.entity.Project;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toProjectSummaryResponseList(List<Project> projects);
}
