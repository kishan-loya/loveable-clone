package com.kishan.loveable_clone.controller;

import com.kishan.loveable_clone.dto.file.FileContentResponse;
import com.kishan.loveable_clone.dto.file.FileNode;
import com.kishan.loveable_clone.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/projects/{projectId}/files")
@RequiredArgsConstructor
public class FileController {

    private final FileService fileService;

    
    @GetMapping
    public ResponseEntity<List<FileNode>> getFileTree(@PathVariable Long projectId) {
        Long userId = 1L; // This should be retrieved from the authenticated user's context
        List<FileNode> fileTree = fileService.getFileTree(projectId, userId);
        return ResponseEntity.ok(fileTree);
    }

    @GetMapping("/{*path}")
    public ResponseEntity<FileContentResponse> getFile(@PathVariable Long projectId, @PathVariable String path) {
        Long userId = 1L; // This should be retrieved from the authenticated user's context
        return ResponseEntity.ok(fileService.getFileContent(projectId, path, userId));
    }
}
