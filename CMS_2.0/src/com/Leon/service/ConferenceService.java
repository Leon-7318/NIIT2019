/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.service;

import com.Leon.pojo.Conference;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Leon
 */
public interface ConferenceService extends BaseService<Conference>{

    @Override
    public Conference findById(int id);

    @Override
    public List<Conference> findAll();

    @Override
    public int findSum();

    @Override
    public boolean update(Conference c);

    @Override
    public boolean delete(Conference c);

    @Override
    public boolean add(Conference c);

    @Override
    public List<Conference> findByRange(int start, int num);

    @Override
    public List<Conference> findByDate(Date start, Date end);

    @Override
    public List<Conference> findByKey(String str);

    @Override
    public List<Conference> findBySketch(String sketch);

    @Override
    public List<Conference> findByName(String name);
    
    
    
}
