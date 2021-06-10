package com.example.second.service;

import com.example.second.entity.Evangel;

import java.util.List;

public interface EvangelService {
    public List<Evangel> findAllEvangels();

    public void addEvangel(Evangel evangel);

    public void deleteEvangelById(Long uid);

    public void updateEvangel(Evangel evangel);

    List<Evangel> findEvangelByTitle(String title);

    public Integer deleteEvangelsByIds(Integer[] ids);
}
