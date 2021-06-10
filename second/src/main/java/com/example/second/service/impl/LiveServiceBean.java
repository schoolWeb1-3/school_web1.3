package com.example.second.service.impl;

import com.example.second.dao.LiveDao;
import com.example.second.entity.Live;
import com.example.second.service.LiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LiveServiceBean implements LiveService {
    @Autowired
    private LiveDao liveDao;

    public List<Live> findAllLives() {
        return this.liveDao.findAllLives();
    }

    @Transactional
    public void addLive(Live live) {
        this.liveDao.addLive(live);
    }
}
