package com.bora.practice.response;

import com.bora.practice.model.Board;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@RequiredArgsConstructor //필요한 멤버만 받는 생성자, @NonNull을 써서 지정할수있다
public abstract class ApiResponse<T> {
    @NonNull private T data;
    private List<String> errors;

}
