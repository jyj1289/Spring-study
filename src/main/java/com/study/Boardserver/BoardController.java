package com.study.Boardserver;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/board/create")
    public BoardDto create(@RequestBody BoardDto boardDto){
        return boardService.create(boardDto);
    }

    @GetMapping("/board/find/{id}")
    public BoardDto findOne(@PathVariable Long id){
        return boardService.findOne(id);
    }

    @GetMapping("/board/findall")
    public List<BoardDto> findAll(){
        return boardService.findAll();
    }

    @PutMapping("/board/update")
    public BoardDto update(@RequestBody BoardDto boardDto){
        return boardService.update(boardDto);
    }
}
