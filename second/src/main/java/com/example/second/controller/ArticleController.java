package com.example.second.controller;

import com.example.second.entity.Article;
import com.example.second.service.ArticleService;
import com.example.second.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController    //代表接口中返回都是json格式数据
@RequestMapping("/article")
@ResponseBody
@CrossOrigin(allowCredentials = "true")  //运行所有请求、所有域访问，解决跨域问题
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有老师
     */
    @GetMapping("/findAllArticles")
    public List<Article> findAllArticles() {
        return this.articleService.findAllArticles();
    }

    /**
     * 增加老师
     */
    @PostMapping("/addArticle")
    public void addArticle(@RequestBody Article article){
        this.articleService.addArticle(article);
    }

    /**
     * 根据老师id删除老师
     */
    @PostMapping("/deleteArticle")
    public void deleteArticleById(@RequestParam Long id) {
        this.articleService.deleteArticleById(id);
    }

    /**
     * 编辑老师
     */
    @PostMapping("/updateArticle")
    public void updateArticle(@RequestBody Article article){
        this.articleService.updateArticle(article);
    }

    /**
     * 根据老师姓名查找老师
     */
    @GetMapping("/findArticleByName")
    public List<Article> findArticleByName(@RequestParam String name) {
        return this.articleService.findArticleByName(name);
    }

    /**
     * 批量删除老师
     */
    @PostMapping("/deleteArticlesByIds")
    public Integer deleteArticlesByIds(Integer[] ids) {
        return this.articleService.deleteArticlesByIds(ids);
    }
}
