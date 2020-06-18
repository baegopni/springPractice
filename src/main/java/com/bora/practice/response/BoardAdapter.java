package com.bora.practice.response;

import com.bora.practice.model.Board;

import java.util.List;

public class BoardAdapter {
    public static BoardResponse boardResponse(final Board board, final List<String> errors){
        return BoardResponse.builder().board(board).errors(errors).build();
    }
}
