package com.bora.practice.controller;

import com.bora.practice.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(value = "/home")
public class PracticeController {

/*
    @GetMapping()
    public User index() {
        return new User("010-1111-1111", "이름", "서울시", new String[]{"기본값"});
    }
*/

    @GetMapping("home")
    public User getUser(
            @RequestParam(value = "name", required = false, defaultValue = "name") String name,
            @RequestParam(value = "arr", required = false, defaultValue = "arr") String arr[]) {
        User user = new User("010-1111-1111", name, "서울시", arr);
        return user;
    }

    @PostMapping("home")
    public User postUser(@RequestBody User user) {
        String name = user.getName();
        String[] arr = user.getArr();
        return user = new User("010-1111-1111",name, "서울시", arr);
    }
}