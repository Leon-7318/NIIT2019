/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.service.Impl;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Leon.dao.ConferenceDao;
import com.Leon.dao.impl.ConferenceDaoImpl;
import com.Leon.pojo.Conference;
import com.Leon.service.ConferenceService;

/**
 *
 * @author Leon
 */
@Service
public class ConferenceServiceImpl implements ConferenceService{

//	@Resource(name="conferenceDaoImpl")
//	private ConferenceDao dao;
	private ConferenceDao dao = new ConferenceDaoImpl();
    
    @Override
    public Conference findById(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Conference> findAll() {
        return dao.findAll();
    }

    @Override
    public int findSum() {
        return dao.findAll().size();
    }

    @Override
    public boolean update(Conference c) {
        if(dao.update(c)!=0)
            return true;
        return false;
    }

    @Override
    public boolean delete(Conference c) {
        if(dao.delete(c.getId())!=0)
            return true;
        return false;
    }

    @Override
    public boolean add(Conference c) {
        if(dao.save(c)!=0)
            return true;
        return false;
    }

    
    @Override
    public List<Conference> findByRange(int start, int num) {
        return dao.findByRange(start, num);
    }

    @Override
    public List<Conference> findByDate(Date start, Date end) {
        return dao.findByDate(start, end);
    }

    @Override
    public List<Conference> findByKey(String str) {
        return dao.findByKey(str);
    }

    @Override
    public List<Conference> findBySketch(String sketch) {
        return dao.findBySketch(sketch);
    }

    @Override
    public List<Conference> findByName(String name) {
        return dao.findByName(name);
    }

    @Override
    public Integer getMaxId() {
        return dao.getMaxId();
    }

}
