package com.example.second.dao;

import com.example.second.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "ArticleDao")
public interface ArticleDao {
    List<Article> findAllArticles();

    int deleteArticleById(Long uid);

    int insert(Article article);

    int addArticle(Article article);

    Article selectByPrimaryKey(Long uid);

    int updateArticle(Article article);

    int updateByPrimaryKey(Article article);

    List<Article> findArticleByName(String name);

    Integer deleteArticlesByIds(@Param("ids") Integer[] ids);

    int getCountArticles();
}
