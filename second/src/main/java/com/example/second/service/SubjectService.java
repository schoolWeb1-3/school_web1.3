package com.example.second.service;

import com.example.second.entity.Subject;

import java.util.List;

public interface SubjectService {
    public List<Subject> findAllSubjects();

    public void addSubject(Subject subject);

    public void deleteSubjectById(Long uid);

    public void updateSubject(Subject subject);

    List<Subject> findSubjectByTitle(String title);

    public Integer deleteSubjectsByIds(Integer[] ids);
}
