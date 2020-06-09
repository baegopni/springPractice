package com.bora.practice.controller;

import com.bora.practice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class PracticeController {

    @GetMapping()
    public User index() {
        return new User("010-1111-1111", "name", "서울시");
    }

    @GetMapping("args")
    public  User getArgs(
            @RequestParam(value = "name")String name) {
        User user = new User("010-1111-1111", name, "서울시");
        user.setName(user.getName());

        return user;
    }
}
