package com.study.Boardserver;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BoardDto {
    private Long id;
    private String title;
    private String content;

    BoardDto(Board board){
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
    }
}
