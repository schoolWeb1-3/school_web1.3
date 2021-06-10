package com.example.second.dao;

import com.example.second.entity.Live;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "LiveDao")
public interface LiveDao {
    List<Live> findAllLives();

    void addLive(Live information);
}
