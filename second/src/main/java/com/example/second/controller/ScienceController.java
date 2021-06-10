package com.example.second.controller;

import com.example.second.entity.Science;
import com.example.second.service.MenuService;
import com.example.second.service.ScienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/science")
@CrossOrigin(allowCredentials = "true")
public class ScienceController {

    @Autowired
    private ScienceService scienceService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有学术
     */
    @GetMapping("/findAllSciences")
    public List<Science> findAllSciences() {
        return this.scienceService.findAllSciences();
    }

    /**
     * 增加学术
     */
    @PostMapping("/addScience")
    public void addScience(@RequestBody Science science) {
        this.scienceService.addScience(science);
    }

    /**
     * 根据学术id删除学术
     */
    @PostMapping("/deleteScience")
    public void deleteScienceById(@RequestParam Long uid) {
        this.scienceService.deleteScienceById(uid);
    }

    /**
     * 编辑学术
     */
    @PostMapping("/updateScience")
    public void updateScience(@RequestBody Science science) {
        this.scienceService.updateScience(science);
    }

    /**
     * 根据学术姓名查找学术
     */
    @GetMapping("/findScienceByTitle")
    public List<Science> findScienceByTitle(@RequestParam String title) {
        return this.scienceService.findScienceByTitle(title);
    }

    /**
     * 批量删除学术
     */
    @PostMapping("/deleteSciencesByIds")
    public Integer deleteSciencesByIds(Integer[] ids) {
        return this.scienceService.deleteSciencesByIds(ids);
    }
}

