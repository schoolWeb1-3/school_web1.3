package com.example.second.service.impl;

import com.example.second.dao.UserDao;
import com.example.second.entity.User;
import com.example.second.entity.UserRole;
import com.example.second.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class UserServiceBean implements UserService, UserDetailsService {

    @Autowired
    UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.loadUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        user.setRoles(userDao.getRolesById(user.getId()));
        return user;
    }

    public List<User> findAllUsers() {
        List<User> users = this.userDao.findAllUsers();
        for (int i = 0; i < users.size(); i++) {
            users.get(i).setPassword(null);
        }
        return users;
    }

    public void deleteUserById(Integer id) {
        this.userDao.deleteUserById(id);
    }

    public void addUser(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password = user.getPassword();
        String newPassword = encoder.encode(password);
        user.setPassword(newPassword);
        this.userDao.addUser(user);
    }

    public void updateUser(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password= user.getPassword();
        String newPassword = encoder.encode(password);
        user.setPassword(newPassword);
        this.userDao.updateUser(user);
    }

    @Override
    public User selectByName(String username) {
        return userDao.getUserByName(username);
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    public Map<String, Object> register(String username, String passwd, String radio) {
        Map<String, Object> result = new HashMap<>();

        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(passwd)) {
            result.put("message", "用户名和密码不能为空");
            return result;
        }
        // 验证用户名是否已经注册
        User exsitUser = selectByName(username);
        if (exsitUser != null) {
            result.put("message","该用户名已存在");

            return result;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(new Date());
        User user = new User();
        UserRole userRole = new UserRole();
        user.setUsername(username);
        user.setRegistTime(format);
        user.setEnabled(true);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(passwd));
        int count = insert(user);
        if(radio.equals("1")) {
            userRole.setUid(user.getId());
            userRole.setRid(3);
            insert_role(userRole);
        }
        if(radio.equals("2")) {
            userRole.setUid(user.getId());
            userRole.setRid(2);
            insert_role(userRole);
        }
        System.out.println(count);
        if (count != 1) {
            result.put("message","注册失败");
            return result;
        }
        result.put("message","注册成功");
        result.put("code", 200);
        return result;
    }

    public void insert_role(UserRole userRole) {
        this.userDao.insert_role(userRole);
    }

    @Override
    public List<User> findSelfInfo() {
        //        System.out.println(SecurityContextHolder.getContext().getAuthentication());
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        // 获取当前登录用户名
        String name = authentication.getName();
        User user = selectByName(name);
        List<User> list = new ArrayList<>();
        list.add(user);
        return list;
    }

    @Override
    public void updateInfo(User user) {
        updateUser(user);
    }
}
