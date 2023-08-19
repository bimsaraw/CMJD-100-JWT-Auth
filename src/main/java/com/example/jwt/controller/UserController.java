package com.example.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.dto.UserProfileDTO;
import com.example.jwt.entity.User;
import com.example.jwt.service.UserService;

@CrossOrigin(origins = "*")
@RestController
public class UserController {

    @Autowired
    UserService userService;
    
    @PostMapping("/user/{id}/profile")
    public ResponseEntity<User> updateProfile(@PathVariable Long id, @ModelAttribute UserProfileDTO userProfileDTO) {
        return new ResponseEntity<User>(userService.updateUser(id, userProfileDTO), HttpStatus.OK);
    }

    @GetMapping("/user/{id}") 
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return new ResponseEntity<User>(userService.getUserById(id), HttpStatus.OK);
    }
}
