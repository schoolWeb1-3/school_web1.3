package com.example.second.dao;

import com.example.second.entity.Role;
import com.example.second.entity.User;
import com.example.second.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value="UserDao")
public interface UserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User user);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateUser(User user);

    int updateByPrimaryKey(User record);

    User loadUserByUsername(String username);

    List<Role> getRolesById(Integer id);

    List<User> findAllUsers();

    void deleteUserById(Integer id);

    void addUser(User user);

    User getUserByName(String username);

    void insert_role(UserRole userRole);
}
