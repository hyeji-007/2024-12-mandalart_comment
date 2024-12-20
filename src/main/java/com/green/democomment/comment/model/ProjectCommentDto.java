package com.green.democomment.comment.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectCommentDto {
    private long commentId;
    private long projectId;
    private String userId;
    private String content;
    private String nickName;
    private String createdAt;
    private String updatedAt;
}
