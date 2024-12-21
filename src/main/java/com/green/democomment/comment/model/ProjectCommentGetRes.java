package com.green.democomment.comment.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Schema(title = "공유 프로젝트 댓글 리스트 응답")
@ToString
public class ProjectCommentGetRes {
    @Schema(title = "응답 상태 코드", example = "200")
    private int statusCode;
    @Schema(title = "응답 메시지", example = "만다라트 댓글 조회완료")
    private String resultMsg;
    @Schema(title = "댓글 목록")
    private List<ProjectCommentDto> contentList;
}
