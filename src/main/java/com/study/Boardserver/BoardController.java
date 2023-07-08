package com.study.Boardserver;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/board/create")
    public BoardDto create(@RequestBody BoardDto boardDto){
        return boardService.create(boardDto);
    }
}
