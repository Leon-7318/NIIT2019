/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.service.Impl;

import com.Leon.dao.VideoDao;
import com.Leon.dao.impl.BaseDaoImpl;
import com.Leon.dao.impl.VideoDaoImpl;
import com.Leon.pojo.Video;
import com.Leon.service.VideoService;
import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 *
 * @author Leon
 */
@Service
public class VideoServiceImpl implements VideoService{
	
//	@Resource(name="videoDaoImpl")
//    private VideoDao dao;
	private VideoDao dao = new VideoDaoImpl();
	
    @Override
    public Video findById(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Video> findAll() {
        return dao.findAll();
    }

    @Override
    public int findSum() {
        return dao.findAll().size();
    }

    @Override
    public boolean update(Video v) {
        if(dao.update(v)!=0)
            return true;
        return false;
    }

    @Override
    public boolean delete(Video v) {
        if(dao.delete(v.getId())!=0)
            return true;
        return false;
    }

    @Override
    public boolean add(Video v) {
        if(dao.save(v)!=0)
            return true;
        return false;
    }

    
    @Override
    public List<Video> findByRange(int start, int num) {
        return dao.findByRange(start, num);
    }

    @Override
    public List<Video> findByDate(Date start, Date end) {
        return dao.findByDate(start, end);
    }

    @Override
    public List<Video> findByKey(String str) {
        return dao.findByKey(str);
    }

    @Override
    public List<Video> findBySketch(String sketch) {
        return dao.findBySketch(sketch);
    }

    @Override
    public List<Video> findByName(String name) {
        return dao.findByName(name);
    }

    @Override
    public Integer getMaxId() {
        return dao.getMaxId();
    }
    
}
