package com.example.second.service;

import com.example.second.entity.Message;

import java.util.List;

public interface MessageService {
    public List<Message> findAllMessages();

    public void addMessage(Message message);

    public void deleteMessageById(Long uid);

    public void updateMessage(Message message);

    List<Message> findMessageByTitle(String title);

    public Integer deleteMessagesByIds(Integer[] ids);
}
