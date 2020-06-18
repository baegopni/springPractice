package com.bora.practice.controller;

import com.bora.practice.Service.BoardService;
import com.bora.practice.model.Board;
import com.bora.practice.response.BoardAdapter;
import com.bora.practice.response.BoardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping(value="{id}")
    public @ResponseBody BoardResponse get(@PathVariable(value="id")String id){
        List<String> errors = new ArrayList<>();
        Board board = null;

        try{
            board = boardService.get(id);
        }catch (final Exception e){
            errors.add(e.getMessage());
        }
        return BoardAdapter.boardResponse(board, errors);
    }
}
