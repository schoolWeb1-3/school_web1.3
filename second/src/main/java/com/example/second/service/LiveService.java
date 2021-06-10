package com.example.second.service;

import com.example.second.entity.Live;

import java.util.List;

public interface LiveService {
    public List<Live> findAllLives();

    public void addLive(Live live);
}
