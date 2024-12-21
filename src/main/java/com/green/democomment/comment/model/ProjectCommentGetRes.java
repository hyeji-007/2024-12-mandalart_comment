package com.green.democomment.comment.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Schema(title = "공유 프로젝트 댓글 리스트 응답")
public class ProjectCommentGetRes {
    @Schema(title = "댓글 목록")
    private List<ProjectCommentDto> contentList;
}
