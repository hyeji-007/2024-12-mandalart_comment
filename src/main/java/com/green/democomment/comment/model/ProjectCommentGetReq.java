package com.green.democomment.comment.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.ToString;

import java.beans.ConstructorProperties;

@Getter
@Schema(title = "공유 프로젝트 댓글 리스트 요청")
@ToString
public class ProjectCommentGetReq {

    @Schema(title = "프로젝트 PK", description = "프로젝트 PK", name = "project_id", example = "1"
            , requiredMode = Schema.RequiredMode.REQUIRED)
    private long projectId;


    @ConstructorProperties({"project_id"})
    public ProjectCommentGetReq(long projectId) {
        this.projectId = projectId;
    }
}
