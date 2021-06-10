package com.example.second.controller;


import com.example.second.entity.Teacher;
import com.example.second.service.MenuService;
import com.example.second.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/public")
@CrossOrigin(allowCredentials = "true")
public class PublicController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有老师
     */
    @GetMapping("/findAllTeachers")
    public List<Teacher> findAllTeachers() {
        return this.teacherService.findAllTeachers();
    }

    /**
     * 增加老师
     */
    @PostMapping("/addTeacher")
    public void addTeacher(@RequestBody Teacher teacher) {
        this.teacherService.addTeacher(teacher);
    }

    /**
     * 根据老师id删除老师
     */
    @PostMapping("/deleteTeacher")
    public void deleteTeacherById(@RequestParam Long uid) {
        this.teacherService.deleteTeacherById(uid);
    }

    /**
     * 编辑老师
     */
    @PostMapping("/updateTeacher")
    public void updateTeacher(@RequestBody Teacher teacher) {
        this.teacherService.updateTeacher(teacher);
    }

    /**
     * 根据老师姓名查找老师
     */
    @GetMapping("/findTeacherByName")
    public List<Teacher> findTeacherByName(@RequestParam String name) {
        return this.teacherService.findTeacherByName(name);
    }

    /**
     * 批量删除老师
     */
    @PostMapping("/deleteTeachersByIds")
    public Integer deleteTeachersByIds(Integer[] ids) {
        return this.teacherService.deleteTeachersByIds(ids);
    }
}
