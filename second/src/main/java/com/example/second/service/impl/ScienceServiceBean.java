package com.example.second.service.impl;


import com.example.second.dao.ScienceDao;
import com.example.second.entity.Science;
import com.example.second.service.ScienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ScienceServiceBean implements ScienceService {
    @Autowired
    private ScienceDao scienceDao;



    public List<Science> findAllSciences() {
        return this.scienceDao.findAllSciences();
    }


    @Transactional
    public void addScience(Science science) {
        this.scienceDao.addScience(science);
//        this.scienceCopyDao.addScience(science);
        Integer count = this.scienceDao.getCountSciences();
    }

    public void deleteScienceById(Long uid) {
        this.scienceDao.deleteScienceById(uid);
        Integer count = this.scienceDao.getCountSciences();
    }

    public void updateScience(Science science) {
        this.scienceDao.updateScience(science);
    }

    public List<Science> findScienceByTitle(String title) {
        return this.scienceDao.findScienceByTitle(title);
    }

    public Integer deleteSciencesByIds(Integer[] ids) {
        return this.scienceDao.deleteSciencesByIds(ids);
    }
}
