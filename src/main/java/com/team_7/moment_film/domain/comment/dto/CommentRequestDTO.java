package com.team_7.moment_film.domain.comment.dto;

import com.team_7.moment_film.domain.user.entity.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class CommentRequestDTO {

    private User writer;
    private Long PostId;
    private String content;

    // 기본 생성자 추가
    public CommentRequestDTO() {
    }


    public CommentRequestDTO(String content, User writer, Long postId) {
        this.writer = writer;
        this.content = content;
        this.PostId = postId;
    }
}
