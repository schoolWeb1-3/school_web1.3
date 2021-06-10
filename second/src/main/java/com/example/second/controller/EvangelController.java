package com.example.second.controller;

import com.example.second.entity.Evangel;
import com.example.second.service.MenuService;
import com.example.second.service.EvangelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evangel")
@CrossOrigin(allowCredentials = "true")
public class EvangelController {

    @Autowired
    private EvangelService evangelService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有佳音
     */
    @GetMapping("/findAllEvangels")
    public List<Evangel> findAllEvangels() {
        return this.evangelService.findAllEvangels();
    }

    /**
     * 增加佳音
     */
    @PostMapping("/addEvangel")
    public void addEvangel(@RequestBody Evangel evangel) {
        this.evangelService.addEvangel(evangel);
    }

    /**
     * 根据佳音id删除佳音
     */
    @PostMapping("/deleteEvangel")
    public void deleteEvangelById(@RequestParam Long uid) {
        this.evangelService.deleteEvangelById(uid);
    }

    /**
     * 编辑佳音
     */
    @PostMapping("/updateEvangel")
    public void updateEvangel(@RequestBody Evangel evangel) {
        this.evangelService.updateEvangel(evangel);
    }

    /**
     * 根据佳音姓名查找佳音
     */
    @GetMapping("/findEvangelByTitle")
    public List<Evangel> findEvangelByTitle(@RequestParam String title) {
        return this.evangelService.findEvangelByTitle(title);
    }

    /**
     * 批量删除佳音
     */
    @PostMapping("/deleteEvangelsByIds")
    public Integer deleteEvangelsByIds(Integer[] ids) {
        return this.evangelService.deleteEvangelsByIds(ids);
    }
}

