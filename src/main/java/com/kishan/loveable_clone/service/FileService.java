package com.kishan.loveable_clone.service;

import com.kishan.loveable_clone.dto.file.FileContentResponse;
import com.kishan.loveable_clone.dto.file.FileNode;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
