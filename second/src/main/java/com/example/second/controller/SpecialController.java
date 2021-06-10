package com.example.second.controller;

import com.example.second.entity.Special;
import com.example.second.service.MenuService;
import com.example.second.service.SpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/special")
@CrossOrigin(allowCredentials = "true")
public class SpecialController {

    @Autowired
    private SpecialService specialService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有专题
     */
    @GetMapping("/findAllSpecials")
    public List<Special> findAllSpecials() {
        return this.specialService.findAllSpecials();
    }

    /**
     * 增加专题
     */
    @PostMapping("/addSpecial")
    public void addSpecial(@RequestBody Special special) {
        this.specialService.addSpecial(special);
    }

    /**
     * 根据专题id删除专题
     */
    @PostMapping("/deleteSpecial")
    public void deleteSpecialById(@RequestParam Long uid) {
        this.specialService.deleteSpecialById(uid);
    }

    /**
     * 编辑专题
     */
    @PostMapping("/updateSpecial")
    public void updateSpecial(@RequestBody Special special) {
        this.specialService.updateSpecial(special);
    }

    /**
     * 根据专题姓名查找专题
     */
    @GetMapping("/findSpecialByTitle")
    public List<Special> findSpecialByTitle(@RequestParam String title) {
        return this.specialService.findSpecialByTitle(title);
    }

    /**
     * 批量删除专题
     */
    @PostMapping("/deleteSpecialsByIds")
    public Integer deleteSpecialsByIds(Integer[] ids) {
        return this.specialService.deleteSpecialsByIds(ids);
    }
}

