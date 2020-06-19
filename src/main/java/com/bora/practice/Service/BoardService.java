package com.bora.practice.Service;

import com.bora.practice.model.Board;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BoardService {
    private List<Board> datas = new ArrayList<>();

    public BoardService(){
        datas.add(new Board(1, "테스트 게시판 제목", "테스트 내용", "날짜", "어드민"));
        datas.add(new Board(2, "테스트 게시판 제목2", "테스트 내용2", "날짜", "어드민"));
    }

    //보드추가
    public void addBoard(Board b){
        b.setId(datas.size()+1);
        datas.add(b);
    }

    //보드 전체 목록
    public List<Board> listBoard(){
        return datas;
    }

    //id값으로 보드조회
    public Board getBoard(int id){
        return datas.get(id-1);
    }

    //id값으로 보드삭제
    public void delBoard(int id){
        datas.remove(id-1);
    }
}
