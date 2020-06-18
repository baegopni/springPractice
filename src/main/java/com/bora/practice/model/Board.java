package com.bora.practice.model;

import lombok.*;

@Data
@Getter @Setter
@NoArgsConstructor  //매개변수를 받지않는 생성자
@AllArgsConstructor //생성자
@Builder
public class Board {
    private int id;
    private String title;
    private String content;
    private String regDate;
    private String writer;
}
