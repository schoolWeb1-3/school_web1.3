package com.example.second.service.impl;


import com.example.second.dao.SpecialDao;
import com.example.second.entity.Special;
import com.example.second.service.SpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SpecialServiceBean implements SpecialService {
    @Autowired
    private SpecialDao specialDao;



    public List<Special> findAllSpecials() {
        return this.specialDao.findAllSpecials();
    }


    @Transactional
    public void addSpecial(Special special) {
        this.specialDao.addSpecial(special);
//        this.specialCopyDao.addSpecial(special);
        Integer count = this.specialDao.getCountSpecials();
    }

    public void deleteSpecialById(Long uid) {
        this.specialDao.deleteSpecialById(uid);
        Integer count = this.specialDao.getCountSpecials();
    }

    public void updateSpecial(Special special) {
        this.specialDao.updateSpecial(special);
    }

    public List<Special> findSpecialByTitle(String title) {
        return this.specialDao.findSpecialByTitle(title);
    }

    public Integer deleteSpecialsByIds(Integer[] ids) {
        return this.specialDao.deleteSpecialsByIds(ids);
    }
}
