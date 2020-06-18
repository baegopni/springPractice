package com.bora.practice.response;

import com.bora.practice.model.Board;
import lombok.Builder;

import java.util.List;

public class BoardResponse extends ApiResponse<Board> {

    @Builder
    public BoardResponse(final Board board, final List<String> errors){
        super(board);
        this.setErrors(errors);
    }
}
