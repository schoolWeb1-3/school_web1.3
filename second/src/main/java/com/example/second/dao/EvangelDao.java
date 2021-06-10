package com.example.second.dao;

import com.example.second.entity.Evangel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "EvangelDao")
public interface EvangelDao {
    List<Evangel> findAllEvangels();

    int deleteEvangelById(Long uid);

    int insert(Evangel evangel);

    int addEvangel(Evangel evangel);

    Evangel selectByPrimaryKey(Long uid);

    int updateEvangel(Evangel evangel);

    int updateByPrimaryKey(Evangel evangel);

    List<Evangel> findEvangelByTitle(String title);

    Integer deleteEvangelsByIds(@Param("ids") Integer[] ids);

    int getCountEvangels();
}
