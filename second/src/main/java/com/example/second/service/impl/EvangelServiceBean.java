package com.example.second.service.impl;


import com.example.second.dao.EvangelDao;
import com.example.second.entity.Evangel;
import com.example.second.service.EvangelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EvangelServiceBean implements EvangelService {
    @Autowired
    private EvangelDao evangelDao;

    public List<Evangel> findAllEvangels() {
        return this.evangelDao.findAllEvangels();
    }


    @Transactional
    public void addEvangel(Evangel evangel) {
        this.evangelDao.addEvangel(evangel);
//        this.evangelCopyDao.addEvangel(evangel);
        Integer count = this.evangelDao.getCountEvangels();
    }

    public void deleteEvangelById(Long uid) {
        this.evangelDao.deleteEvangelById(uid);
        Integer count = this.evangelDao.getCountEvangels();
    }

    public void updateEvangel(Evangel evangel) {
        this.evangelDao.updateEvangel(evangel);
    }

    public List<Evangel> findEvangelByTitle(String title) {
        return this.evangelDao.findEvangelByTitle(title);
    }

    public Integer deleteEvangelsByIds(Integer[] ids) {
        return this.evangelDao.deleteEvangelsByIds(ids);
    }
}
