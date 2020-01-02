/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.service;

import com.Leon.pojo.Video;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Leon
 */
public interface VideoService extends BaseService<Video>{

    @Override
    public Video findById(int id);

    @Override
    public List<Video> findAll();

    @Override
    public int findSum();

    @Override
    public boolean update(Video v);

    @Override
    public boolean delete(Video v);

    @Override
    public boolean add(Video v);

    @Override
    public List<Video> findByRange(int start, int num);

    @Override
    public List<Video> findByDate(Date start, Date end);

    @Override
    public List<Video> findByKey(String str);

    @Override
    public List<Video> findBySketch(String sketch);

    @Override
    public List<Video> findByName(String name);
    
    
}
