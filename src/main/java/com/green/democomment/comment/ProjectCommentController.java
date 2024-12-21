package com.green.democomment.comment;

import com.green.democomment.comment.model.ProjectCommentDelReq;
import com.green.democomment.comment.model.ProjectCommentGetReq;
import com.green.democomment.comment.model.ProjectCommentGetRes;
import com.green.democomment.comment.model.ProjectCommentPostReq;
import com.green.democomment.common.model.ResultResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;

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

    @GetMapping
    @Operation(summary = "프로젝트 댓글 리스트")
    public ResultResponse<ProjectCommentGetRes> getProjectCommentList(@ParameterObject @ModelAttribute ProjectCommentGetReq p) {
        ProjectCommentGetRes res = service.getProjectCommentList(p);
        return ResultResponse.<ProjectCommentGetRes>builder()
                .resultMessage(String.format("%d rows", res.getContentList().size()))
                .resultData(res)
                .build();
    }

    @DeleteMapping
    public ResultResponse<Integer> deleteProjectComment(@ParameterObject @ModelAttribute ProjectCommentDelReq p) {
        int res = service.deleteProjectComment(p);
        return ResultResponse.<Integer>builder()
                .resultMessage("댓글 삭제가 완료되었습니다.")
                .resultData(res)
                .build();
    }


}
