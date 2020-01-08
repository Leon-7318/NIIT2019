/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.dao;

import com.Leon.pojo.Conference;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Leon
 */
public interface ConferenceDao extends BaseDao<Conference>{
    
    @Override
    public Conference findById(Serializable id);

    @Override
    public List findAll();
    
    @Override
    public int delete(Serializable id);

    @Override
    public int update(Conference entity);

    @Override
    public int save(Conference entity);

    public Integer getMaxId();

    public List<Conference> findByRange(int start, int num);

    public List<Conference> findByDate(Date start, Date end);

    public List<Conference> findByKey(String str);

    public List<Conference> findBySketch(String sketch);

    public List<Conference> findByName(String name);
    
    
}
