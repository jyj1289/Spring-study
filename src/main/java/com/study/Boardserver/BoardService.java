package com.study.Boardserver;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardDto create(BoardDto boardDto){
        Board board = new Board(boardDto.getTitle(), boardDto.getContent());

        Board save = boardRepository.save(board);

        return new BoardDto(save);
    }
}
