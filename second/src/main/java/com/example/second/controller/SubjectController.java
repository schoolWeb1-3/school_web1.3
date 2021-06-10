package com.example.second.controller;

import com.example.second.entity.Subject;
import com.example.second.service.MenuService;
import com.example.second.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
@CrossOrigin(allowCredentials = "true")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有学科
     */
    @GetMapping("/findAllSubjects")
    public List<Subject> findAllSubjects() {
        return this.subjectService.findAllSubjects();
    }

    /**
     * 增加学科
     */
    @PostMapping("/addSubject")
    public void addSubject(@RequestBody Subject subject) {
        this.subjectService.addSubject(subject);
    }

    /**
     * 根据学科id删除学科
     */
    @PostMapping("/deleteSubject")
    public void deleteSubjectById(@RequestParam Long uid) {
        this.subjectService.deleteSubjectById(uid);
    }

    /**
     * 编辑学科
     */
    @PostMapping("/updateSubject")
    public void updateSubject(@RequestBody Subject subject) {
        this.subjectService.updateSubject(subject);
    }

    /**
     * 根据学科姓名查找学科
     */
    @GetMapping("/findSubjectByTitle")
    public List<Subject> findSubjectByTitle(@RequestParam String title) {
        return this.subjectService.findSubjectByTitle(title);
    }

    /**
     * 批量删除学科
     */
    @PostMapping("/deleteSubjectsByIds")
    public Integer deleteSubjectsByIds(Integer[] ids) {
        return this.subjectService.deleteSubjectsByIds(ids);
    }
}

