package com.example.second.controller;

import com.example.second.entity.Message;
import com.example.second.service.MenuService;
import com.example.second.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
@CrossOrigin(allowCredentials = "true")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @Autowired
    MenuService menuService;

    /**
     * 查询所有信息
     */
    @GetMapping("/findAllMessages")
    public List<Message> findAllMessages() {
        return this.messageService.findAllMessages();
    }

    /**
     * 增加信息
     */
    @PostMapping("/addMessage")
    public void addMessage(@RequestBody Message message) {
        this.messageService.addMessage(message);
    }

    /**
     * 根据信息id删除信息
     */
    @PostMapping("/deleteMessage")
    public void deleteMessageById(@RequestParam Long uid) {
        this.messageService.deleteMessageById(uid);
    }

    /**
     * 编辑信息
     */
    @PostMapping("/updateMessage")
    public void updateMessage(@RequestBody Message message) {
        this.messageService.updateMessage(message);
    }

    /**
     * 根据信息姓名查找信息
     */
    @GetMapping("/findMessageByTitle")
    public List<Message> findMessageByTitle(@RequestParam String title) {
        return this.messageService.findMessageByTitle(title);
    }

    /**
     * 批量删除信息
     */
    @PostMapping("/deleteMessagesByIds")
    public Integer deleteMessagesByIds(Integer[] ids) {
        return this.messageService.deleteMessagesByIds(ids);
    }
}

