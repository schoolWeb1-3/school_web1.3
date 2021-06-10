package com.example.second.service.impl;

import com.example.second.dao.ArticleDao;
import com.example.second.entity.Article;
import com.example.second.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ArticleServiceBean implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    public List<Article> findAllArticles() {
        return this.articleDao.findAllArticles();
    }

    @Transactional
    public void addArticle(Article article) {
        this.articleDao.addArticle(article);
    }

    public void deleteArticleById(Long id) {
        this.articleDao.deleteArticleById(id);
    }

    public void updateArticle(Article article) {
        this.articleDao.updateArticle(article);
    }

    public List<Article> findArticleByName(String name) {
        return this.articleDao.findArticleByName(name);
    }

    public Integer deleteArticlesByIds(Integer[] ids) {
        return this.articleDao.deleteArticlesByIds(ids);
    }
}
