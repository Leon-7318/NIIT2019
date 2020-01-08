/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.dao.impl;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.Leon.dao.VideoDao;
import com.Leon.pojo.Video;
import com.Leon.util.HibernateUtil;

/**
 *
 * @author Leon
 */
@Repository
public class VideoDaoImpl extends BaseDaoImpl<Video> implements VideoDao{

    @Override
    public List findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Video findById(Serializable id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Serializable id) {
        return super.delete(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Video entity) {
        return super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int save(Video entity) {
        return super.save(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Video> findByRange(int start, int num) {
        return findByRange(start,num,"Video");
    }

    @Override
    public List<Video> findByDate(Date start, Date end) {
        return findByDate(start, end,"Video");
    }

    @Override
    public List<Video> findByKey(String str) {
        Session session=HibernateUtil.getSession();
        Query query = session.createQuery("from Video where title like :str or sketch like :str");
        query.setParameter("str", "%"+str+"%");
        List<Video> res = query.list();
        HibernateUtil.close(session); 
        return res;
    }

    @Override
    public List<Video> findBySketch(String sketch) {
        return findBySketch(sketch,"Video");
    }

    @Override
    public List<Video> findByName(String name) {
        return findByName(name,"Video");
    }
    
    @Override
    public Integer getMaxId() {
        return getMaxId("Video");
    }
}
