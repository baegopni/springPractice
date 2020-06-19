package com.bora.practice.model;

import lombok.*;

@Getter @Setter
@NoArgsConstructor  //매개변수를 받지않는 생성자
@AllArgsConstructor //생성자
public class Board {
//    private int code;
//    private String msg;
    private int id;
    private String title;
    private String content;
    private String regDate;
    private String writer;
}
