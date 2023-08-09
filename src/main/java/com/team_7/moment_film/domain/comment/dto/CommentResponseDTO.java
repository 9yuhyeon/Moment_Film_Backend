package com.team_7.moment_film.domain.comment.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.team_7.moment_film.domain.post.entity.Post;
import com.team_7.moment_film.domain.user.entity.User;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CommentResponseDTO implements Serializable {

    private Long id;
    private String content;
    private Post post;
    private User writer;
    private Long postId;

    @Builder
    public CommentResponseDTO(Long id, String content, User writer, Post post, Long postId) {
        this.id = id;
        this.content = content;
        this.writer = writer;
        this.post = post;
        this.postId = postId;
    }

}
