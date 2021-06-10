package com.example.second.dao;

import com.example.second.entity.Subject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "SubjectDao")
public interface SubjectDao {
    List<Subject> findAllSubjects();

    int deleteSubjectById(Long uid);

    int insert(Subject subject);

    int addSubject(Subject subject);

    Subject selectByPrimaryKey(Long uid);

    int updateSubject(Subject subject);

    int updateByPrimaryKey(Subject subject);

    List<Subject> findSubjectByTitle(String title);

    Integer deleteSubjectsByIds(@Param("ids") Integer[] ids);

    int getCountSubjects();
}
