package com.green.democomment.comment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectCommentDto {
    private long commentId;
    private String userId;
    private String content;
    private String nickName;
    @JsonIgnore
    private long projectId;
}
