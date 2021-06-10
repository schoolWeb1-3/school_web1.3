package com.example.second.service;

import com.example.second.entity.Science;

import java.util.List;

public interface ScienceService {
    public List<Science> findAllSciences();

    public void addScience(Science science);

    public void deleteScienceById(Long uid);

    public void updateScience(Science science);

    List<Science> findScienceByTitle(String title);

    public Integer deleteSciencesByIds(Integer[] ids);
}
