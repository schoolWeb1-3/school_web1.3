package com.example.second.service.impl;


import com.example.second.dao.MessageDao;
import com.example.second.entity.Message;
import com.example.second.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MessageServiceBean implements MessageService {
    @Autowired
    private MessageDao messageDao;



    public List<Message> findAllMessages() {
        return this.messageDao.findAllMessages();
    }


    @Transactional
    public void addMessage(Message message) {
        this.messageDao.addMessage(message);
//        this.messageCopyDao.addMessage(message);
        Integer count = this.messageDao.getCountMessages();
    }

    public void deleteMessageById(Long uid) {
        this.messageDao.deleteMessageById(uid);
        Integer count = this.messageDao.getCountMessages();
    }

    public void updateMessage(Message message) {
        this.messageDao.updateMessage(message);
    }

    public List<Message> findMessageByTitle(String title) {
        return this.messageDao.findMessageByTitle(title);
    }

    public Integer deleteMessagesByIds(Integer[] ids) {
        return this.messageDao.deleteMessagesByIds(ids);
    }
}
