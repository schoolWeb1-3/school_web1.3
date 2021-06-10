package com.example.second.service;

import com.example.second.entity.Special;

import java.util.List;

public interface SpecialService {
    public List<Special> findAllSpecials();

    public void addSpecial(Special special);

    public void deleteSpecialById(Long uid);

    public void updateSpecial(Special special);

    List<Special> findSpecialByTitle(String title);

    public Integer deleteSpecialsByIds(Integer[] ids);
}
