package com.devteria.hello_spring_boot.controller;

import com.devteria.hello_spring_boot.dto.request.UserCreationRequest;
import com.devteria.hello_spring_boot.dto.request.UserUpdateRequest;
import com.devteria.hello_spring_boot.entity.User;
import com.devteria.hello_spring_boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    User createUser(@RequestBody UserCreationRequest request) {
        return userService.createUser(request);
    }

    @GetMapping
    List<User> getUser() {
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    User getUsers(@PathVariable("userId") String userId) {
        return userService.getUser(userId);
    }

    @PutMapping("/{userId}")
    User updateUser(@PathVariable("userId") String userid, @RequestBody UserUpdateRequest request) {
        return userService.updateUser(userid, request);
    }

    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable("userId") String userId) {
        userService.deleteUser(userId);
        return "User has been deleted";
    }

}
