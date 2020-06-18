package com.bora.practice.Service;

import com.bora.practice.model.Board;
import org.springframework.stereotype.Service;


@Service
public class BoardService {
    public Board get(final String id){
        return Board.builder()
                .title("첫번째")
                .content("첫내용")
                .regDate("")
                .writer("어드민")
                .build();
    }

}
