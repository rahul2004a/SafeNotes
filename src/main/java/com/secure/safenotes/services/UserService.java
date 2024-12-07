package com.secure.safenotes.services;

import com.secure.safenotes.dtos.UserDTO;
import com.secure.safenotes.models.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    User findByUsername(String username);
}
