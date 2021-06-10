package com.example.second.service;

import com.example.second.entity.Article;

import java.util.List;

public interface ArticleService {
    public List<Article> findAllArticles();

    public void addArticle(Article article);

    public void deleteArticleById(Long id);

    public void updateArticle(Article article);

    List<Article> findArticleByName(String name);

    public Integer deleteArticlesByIds(Integer[] ids);
}
