package com.study.Boardserver;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

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

    public BoardDto findOne(Long id){
        Board board = boardRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Not found Data"));

        return new BoardDto(board);
    }

    public List<BoardDto> findAll(){
        return boardRepository.findAll()
                .stream()
                .map(BoardDto::new)
                .collect(Collectors.toList());
    }
}
