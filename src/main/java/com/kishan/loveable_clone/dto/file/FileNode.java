package com.kishan.loveable_clone.dto.file;

import java.time.LocalDateTime;

public record FileNode(
        String path,
        LocalDateTime modifiedAt,
        Long size,
        String type
) {
}
