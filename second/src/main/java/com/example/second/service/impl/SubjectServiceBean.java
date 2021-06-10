package com.example.second.service.impl;


import com.example.second.dao.SubjectDao;
import com.example.second.entity.Subject;
import com.example.second.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SubjectServiceBean implements SubjectService {
    @Autowired
    private SubjectDao subjectDao;



    public List<Subject> findAllSubjects() {
        return this.subjectDao.findAllSubjects();
    }


    @Transactional
    public void addSubject(Subject subject) {
        this.subjectDao.addSubject(subject);
//        this.subjectCopyDao.addSubject(subject);
        Integer count = this.subjectDao.getCountSubjects();
    }

    public void deleteSubjectById(Long uid) {
        this.subjectDao.deleteSubjectById(uid);
        Integer count = this.subjectDao.getCountSubjects();
    }

    public void updateSubject(Subject subject) {
        this.subjectDao.updateSubject(subject);
    }

    public List<Subject> findSubjectByTitle(String title) {
        return this.subjectDao.findSubjectByTitle(title);
    }

    public Integer deleteSubjectsByIds(Integer[] ids) {
        return this.subjectDao.deleteSubjectsByIds(ids);
    }
}
