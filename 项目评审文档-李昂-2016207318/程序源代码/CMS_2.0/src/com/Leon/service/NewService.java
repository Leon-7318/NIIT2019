/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.service;

import com.Leon.pojo.New;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Leon
 */
public interface NewService extends BaseService<New>{

    @Override
    public New findById(int id);

    @Override
    public List<New> findAll();

    @Override
    public int findSum();

    @Override
    public boolean update(New n);

    @Override
    public boolean delete(New n);

    @Override
    public boolean add(New n);

    @Override
    public List<New> findByRange(int start, int num);

    @Override
    public List<New> findByDate(Date start, Date end);

    @Override
    public List<New> findByKey(String str);

    @Override
    public List<New> findBySketch(String sketch);

    @Override
    public List<New> findByName(String name);
    
    
}
