package com.example.second.dao;

import com.example.second.entity.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "MessageDao")
public interface MessageDao {
    List<Message> findAllMessages();

    int deleteMessageById(Long uid);

    int insert(Message message);

    int addMessage(Message message);

    Message selectByPrimaryKey(Long uid);

    int updateMessage(Message message);

    int updateByPrimaryKey(Message message);

    List<Message> findMessageByTitle(String title);

    Integer deleteMessagesByIds(@Param("ids") Integer[] ids);

    int getCountMessages();
}
