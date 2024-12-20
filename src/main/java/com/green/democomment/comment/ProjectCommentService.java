package com.green.democomment.comment;

import com.green.democomment.comment.model.ProjectCommentPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectCommentService {
    private final ProjectCommentMapper mapper;

    public long postProjectComment(ProjectCommentPostReq p) {
        mapper.postProjectComment(p);
        return p.getCommentId();
    }
}
