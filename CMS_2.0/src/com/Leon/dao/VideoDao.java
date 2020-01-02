/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.dao;

import com.Leon.pojo.Video;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Leon
 */
public interface VideoDao extends BaseDao<Video>{

    @Override
    public List findAll();

    @Override
    public Video findById(Serializable id);

    @Override
    public int delete(Serializable id);

    @Override
    public int update(Video entity);

    @Override
    public int save(Video entity);
    
    public Integer getMaxId();


    public List<Video> findByRange(int start, int num);

    public List<Video> findByDate(Date start, Date end);

    public List<Video> findByKey(String str);

    public List<Video> findBySketch(String sketch);

    public List<Video> findByName(String name);
    
}
