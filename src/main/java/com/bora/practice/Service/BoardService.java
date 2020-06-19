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

    //id값으로 보드수정
    public void updateBoard(int id, Board b){
        List<Board> temp = new ArrayList<Board>();

        b.setId(id);

        for(int i=0; i<datas.size(); i++) {
            if(i == id-1) {
                temp.add(b);
            }else{
                temp.add(datas.get(i));
            }
        }
        datas = temp;
    }
}
