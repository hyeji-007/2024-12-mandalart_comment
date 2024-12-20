package com.green.democomment.comment;

import com.green.democomment.comment.model.ProjectCommentPostReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectCommentMapper {
    void postProjectComment(ProjectCommentPostReq p);
}
