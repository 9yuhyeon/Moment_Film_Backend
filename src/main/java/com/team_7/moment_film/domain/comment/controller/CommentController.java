package com.team_7.moment_film.domain.comment.controller;


import com.team_7.moment_film.domain.comment.dto.CommentRequestDTO;
import com.team_7.moment_film.domain.comment.dto.CommentResponseDTO;
import com.team_7.moment_film.domain.comment.service.CommentService;
import com.team_7.moment_film.global.dto.CustomResponseEntity;
import com.team_7.moment_film.global.security.UserDetailsImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/post/{postId}/comment")
public class CommentController {

    private final CommentService commentService;

    //생성
    @PostMapping
    public CustomResponseEntity<CommentResponseDTO> createComment(@PathVariable Long postId,@RequestBody CommentRequestDTO requestDTO, @AuthenticationPrincipal UserDetailsImpl userDetails){
        return commentService.createComment(postId,requestDTO,userDetails);
    }

    //삭제
    @DeleteMapping("/{commentId}")
    public CustomResponseEntity<?> deleteComment(@PathVariable Long commentId, @AuthenticationPrincipal UserDetailsImpl userDetails){
        return commentService.deleteComment(commentId, userDetails);
    }

    //조회
    @GetMapping
    public CustomResponseEntity<List<CommentResponseDTO>> getAllComment(@PathVariable Long postId){
        return commentService.getAllComment(postId);
    }

}
