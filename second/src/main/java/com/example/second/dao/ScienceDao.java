package com.example.second.dao;

import com.example.second.entity.Science;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "ScienceDao")
public interface ScienceDao {
    List<Science> findAllSciences();

    int deleteScienceById(Long uid);

    int insert(Science science);

    int addScience(Science science);

    Science selectByPrimaryKey(Long uid);

    int updateScience(Science science);

    int updateByPrimaryKey(Science science);

    List<Science> findScienceByTitle(String title);

    Integer deleteSciencesByIds(@Param("ids") Integer[] ids);

    int getCountSciences();
}
