/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.dao.impl;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Leon.dao.ConferenceDao;
import com.Leon.pojo.Conference;

/**
 *
 * @author Leon
 */
@Repository
public class ConferenceDaoImpl extends BaseDaoImpl<Conference> implements ConferenceDao{
    
    @Override
    public List findAll() {
        return super.findAll(); 
    }

    @Override
    public Conference findById(Serializable id) {
        return super.findById(id); 
    }

    @Override
    public int delete(Serializable id) {
        return super.delete(id); 
    }

    @Override
    public int update(Conference entity) {
        return super.update(entity); 
    }

    @Override
    public int save(Conference entity) {
        return super.save(entity); 
    }

    @Override
    public List<Conference> findByRange(int start, int num) {
        return findByRange(start,num,"Conference");
    }

    @Override
    public List<Conference> findByDate(Date start, Date end) {
        return findByDate(start, end,"Conference");
    }

    @Override
    public List<Conference> findByKey(String str) {
        return findByKey(str,"Conference");
    }

    @Override
    public List<Conference> findBySketch(String sketch) {
        return findBySketch(sketch,"Conference");
    }

    @Override
    public List<Conference> findByName(String name) {
        return findByName(name,"Conference");
    }

    @Override
    public Integer getMaxId() {
        return getMaxId("Conference");
    }

}
