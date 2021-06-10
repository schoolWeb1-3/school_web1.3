package com.example.second.service.impl;

import com.example.second.dao.TeacherCopyDao;
import com.example.second.dao.TeacherDao;
import com.example.second.entity.Teacher;
import com.example.second.exception.ValidateException;
import com.example.second.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TeacherServiceBean implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    @Autowired
    TeacherCopyDao teacherCopyDao;

    public List<Teacher> findAllTeachers() {
        return this.teacherDao.findAllTeachers();
    }

    //返回错误数组
    public List<String> errors(Teacher teacher) {
        List<String> errors = new ArrayList<>();
        String regex_id = "^[a-z0-9A-Z]+$";
        String regex_phone = "^(13[0-9]|14[0-9]|15[0-9]|16[6]|18[0-9]|19[6,9]|17[0-9])\\d{8}$";
        if (!(teacher.getId().matches(regex_id))) {
            errors.add("工号不能包括中文");
        }
        if (teacher.getName().length() < 2 || teacher.getName().length() > 92) {
            String e = ("请输入真实姓名");
            errors.add(e);
        }
        if (teacher.getAge() > 60 || teacher.getAge() < 20) {
            String e = ("年龄在[20-60]范围内");
            errors.add(e);
        }
        if (!(teacher.getPhone().matches(regex_phone))) {
            String e = ("电话号码不合理");
            errors.add(e);
        }
        if (teacher.getLocation().isEmpty()) {
            String e = ("地址不能为空");
            errors.add(e);
        }
        return errors;
    }

    @Transactional
    public void addTeacher(Teacher teacher) {
        if(errors(teacher).size() > 0) {
            throw new ValidateException("-1", errors(teacher).toString());
        } else {
            this.teacherDao.addTeacher(teacher);
        }
    }

    public void deleteTeacherById(Long uid) {
        this.teacherDao.deleteTeacherById(uid);
    }

    public void updateTeacher(Teacher teacher) {
        if(errors(teacher).size() > 0) {
            throw new ValidateException("-1", errors(teacher).toString());
        } else {
            this.teacherDao.updateTeacher(teacher);
        }
    }

    public List<Teacher> findTeacherByName(String name) {
        return this.teacherDao.findTeacherByName(name);
    }

    public Integer deleteTeachersByIds(Integer[] ids) {
        return this.teacherDao.deleteTeachersByIds(ids);
    }
}
