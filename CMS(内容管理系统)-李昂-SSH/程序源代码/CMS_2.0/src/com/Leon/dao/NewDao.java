/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.dao;

import com.Leon.pojo.New;
import java.io.Serializable;
import java.sql.Date;

import java.util.List;

/**
 *
 * @author Leon
 */
public interface NewDao extends BaseDao<New>{

    @Override
    public List findAll();

    @Override
    public New findById(Serializable id);

    @Override
    public int delete(Serializable id);

    @Override
    public int update(New entity);

    @Override
    public int save(New entity);

    public Integer getMaxId();

    
    public List<New> findByRange(int start, int num);

    public List<New> findByDate(Date start, Date end);

    public List<New> findByKey(String str);

    public List<New> findBySketch(String sketch);

    public List<New> findByName(String name);
    
}
