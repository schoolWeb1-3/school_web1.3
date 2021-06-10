package com.example.second.service;

import com.example.second.entity.User;
import com.example.second.entity.UserRole;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> findAllUsers();

    void deleteUserById(Integer id);

    void addUser(User user);

    void updateUser(User user);

    User selectByName(String username);

    int insert(User user);

    Map<String, Object> register(String username, String passwd, String radio);

    void insert_role(UserRole userRole);

    List<User> findSelfInfo();

    void updateInfo(User user);
}
