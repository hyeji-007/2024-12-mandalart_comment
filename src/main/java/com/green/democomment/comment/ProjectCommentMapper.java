package com.green.democomment.comment;

import com.green.democomment.comment.model.ProjectCommentDelReq;
import com.green.democomment.comment.model.ProjectCommentDto;
import com.green.democomment.comment.model.ProjectCommentGetReq;
import com.green.democomment.comment.model.ProjectCommentPostReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectCommentMapper {
    void postProjectComment(ProjectCommentPostReq p);
    List<ProjectCommentDto> getProjectCommentList(ProjectCommentGetReq p);
    int deleteProjectComment(ProjectCommentDelReq p);
}
