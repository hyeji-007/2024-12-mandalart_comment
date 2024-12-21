package com.green.democomment.comment;

import com.green.democomment.comment.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectCommentService {
    private final ProjectCommentMapper mapper;

    public long postProjectComment(ProjectCommentPostReq p) {
        mapper.postProjectComment(p);
        return p.getCommentId();
    }

    public ProjectCommentGetRes getProjectCommentList(ProjectCommentGetReq p) {
        ProjectCommentGetRes res = new ProjectCommentGetRes();
        if (p.getProjectId() <= 0) {
            res.setContentList(new ArrayList<>());
            return res;
        }
        List<ProjectCommentDto> contentList = mapper.getProjectCommentList(p);
        res.setContentList(contentList);
        return res;
    }

    public int deleteProjectComment(ProjectCommentDelReq p) {
        return mapper.deleteProjectComment(p);
    }
}
