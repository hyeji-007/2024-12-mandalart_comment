package com.green.democomment.comment;

import com.green.democomment.comment.model.ProjectCommentPostReq;
import com.green.democomment.common.model.ResultResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("project/comment")
@Tag(name = "프로젝트 댓글", description = "프로젝트 댓글 관리")
public class ProjectCommentController {
    private final ProjectCommentService service;

    @PostMapping
    @Operation(summary = "프로젝트 댓글 등록")
    public ResultResponse<Long> postProjectComment(@RequestBody ProjectCommentPostReq p) {
        long commentId = service.postProjectComment(p);
        return ResultResponse.<Long>builder()
                .resultMessage("댓글 등록 완료")
                .resultData(commentId)
                .build();
    }

}
