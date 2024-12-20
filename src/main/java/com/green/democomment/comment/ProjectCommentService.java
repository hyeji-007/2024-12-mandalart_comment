package com.green.democomment.comment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectCommentService {
    private final ProjectCommentMapper mapper;
}
