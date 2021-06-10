package com.example.second.controller;

import com.example.second.entity.User;
import com.example.second.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/personal")
@CrossOrigin
public class PersonalController {
    @Autowired
    UserService userService;

    @GetMapping("/findSelfInfo")
    public List<User> findSelfInfo() {
        return this.userService.findSelfInfo();
    }

    @PostMapping("/updateInfo")
    public void updateInfo(@RequestBody User user) {
        this.userService.updateInfo(user);
    }
}
