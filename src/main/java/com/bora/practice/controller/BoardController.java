package com.bora.practice.controller;

import com.bora.practice.Service.BoardService;
import com.bora.practice.model.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class BoardController {

    @Autowired BoardService boardService;

    @GetMapping("board")
    public List<Board> getAll(){
        return boardService.listBoard();
    }

    @GetMapping("board/{id}")
    public Board getBoard(@PathVariable int id){
        return boardService.listBoard().get(id-1);
    }

    @PostMapping("board")
    public String addBoard(@RequestBody Board b){
        boardService.addBoard(b);
        return "성공적으로 추가되었습니다.";
    }

    @DeleteMapping("board/{id}")
    public String delBoard(@PathVariable int id){
        boardService.delBoard(id);
        return "성공적으로 삭제되었습니다.";
    }
}
