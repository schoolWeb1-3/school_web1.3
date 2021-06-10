package com.example.second.dao;

import com.example.second.entity.Special;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "SpecialDao")
public interface SpecialDao {
    List<Special> findAllSpecials();

    int deleteSpecialById(Long uid);

    int insert(Special special);

    int addSpecial(Special special);

    Special selectByPrimaryKey(Long uid);

    int updateSpecial(Special special);

    int updateByPrimaryKey(Special special);

    List<Special> findSpecialByTitle(String title);

    Integer deleteSpecialsByIds(@Param("ids") Integer[] ids);

    int getCountSpecials();
}
