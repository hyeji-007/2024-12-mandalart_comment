package com.green.democomment.comment.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProjectCommentGetRes {
    private int statusCode;
    private String resultMsg;
    private List<ProjectCommentDto> contentList;
}
