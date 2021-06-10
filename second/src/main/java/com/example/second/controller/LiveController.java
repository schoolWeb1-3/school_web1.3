package com.example.second.controller;

import com.example.second.entity.Live;
import com.example.second.service.LiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/live")
@CrossOrigin
public class LiveController {
    @Autowired
    LiveService liveService;

    @GetMapping("/findAllLives")
    public List<Live> findAllLives() {
        return this.liveService.findAllLives();
    }

    @PostMapping("/addLive")
    public void addInfo(@RequestBody Live live) {
        this.liveService.addLive(live);
    }

}
