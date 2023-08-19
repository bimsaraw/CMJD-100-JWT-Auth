package com.example.jwt.service;

import org.springframework.stereotype.Service;

import com.example.jwt.dto.UserProfileDTO;
import com.example.jwt.entity.User;

@Service
public interface UserService {
    User updateUser(Long id, UserProfileDTO userProfileDTO);
    User getUserById(Long id);
}
