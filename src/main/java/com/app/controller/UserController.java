package com.app.controller;

import com.app.entity.User;
import com.app.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/user/newUser")
    public ResponseEntity<?> registerNewUser(@RequestBody User user) {
        try {
            User registeredUser = userService.registerNewUser(user);
            return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
        } catch(RuntimeException e) {
            throw e;
        }
    }

    @PostMapping("/user/loginUser")
    public ResponseEntity<?> loginUser(@RequestBody User userDto) {
        try {
            User user = userService.loginUser(userDto);
            if (user != null) {
                return ResponseEntity.ok(user);
            } else {
                return new ResponseEntity<>("User not found!!!", HttpStatus.BAD_REQUEST);
            }
        } catch(RuntimeException e) {
            return new ResponseEntity<>("Processing failed", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
