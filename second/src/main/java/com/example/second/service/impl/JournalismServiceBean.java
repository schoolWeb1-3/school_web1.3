package com.example.second.service.impl;


import com.example.second.dao.JournalismDao;
import com.example.second.entity.Journalism;
import com.example.second.service.JournalismService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JournalismServiceBean implements JournalismService {
    @Autowired
    private JournalismDao journalismDao;



    public List<Journalism> findAllJournalisms() {
        return this.journalismDao.findAllJournalisms();
    }


    @Transactional
    public void addJournalism(Journalism journalism) {
        this.journalismDao.addJournalism(journalism);
//        this.journalismCopyDao.addJournalism(journalism);
        Integer count = this.journalismDao.getCountJournalisms();
    }

    public void deleteJournalismById(Long uid) {
        this.journalismDao.deleteJournalismById(uid);
        Integer count = this.journalismDao.getCountJournalisms();
    }

    public void updateJournalism(Journalism journalism) {
        this.journalismDao.updateJournalism(journalism);
    }

    public List<Journalism> findJournalismByTitle(String title) {
        return this.journalismDao.findJournalismByTitle(title);
    }

    public Integer deleteJournalismsByIds(Integer[] ids) {
        return this.journalismDao.deleteJournalismsByIds(ids);
    }
}
