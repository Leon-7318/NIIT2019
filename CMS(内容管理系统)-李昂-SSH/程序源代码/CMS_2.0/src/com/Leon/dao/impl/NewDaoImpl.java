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

import com.Leon.dao.NewDao;
import com.Leon.pojo.New;
import com.Leon.util.HibernateUtil;

/**
 *
 * @author Leon
 */
@Repository
public class NewDaoImpl extends BaseDaoImpl<New> implements NewDao{

    @Override
    public List findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public New findById(Serializable id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Serializable id) {
        return super.delete(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(New entity) {
        return super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int save(New entity) {
        return super.save(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<New> findByRange(int start, int num) {
        return findByRange(start,num,"New");
    }

    @Override
    public List<New> findByDate(Date start, Date end) {
        return findByDate(start, end,"New");
    }

    @Override
    public List<New> findByKey(String str) {
        Session session=HibernateUtil.getSession();
        Query query = session.createQuery("from New where title like :str or sketch like :str");
        query.setParameter("str", "%"+str+"%");
        List<New> res = query.list();
        HibernateUtil.close(session); 
        return res;
    }

    @Override
    public List<New> findBySketch(String sketch) {
        return findBySketch(sketch,"New");
    }

    @Override
    public List<New> findByName(String name) {
        return findByName(name,"New");
    }
    
    @Override
    public Integer getMaxId() {
        return getMaxId("New");
    }
}
