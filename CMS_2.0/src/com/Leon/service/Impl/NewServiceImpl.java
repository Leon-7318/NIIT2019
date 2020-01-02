/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.service.Impl;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Leon.dao.NewDao;
import com.Leon.dao.impl.NewDaoImpl;
import com.Leon.pojo.New;
import com.Leon.service.NewService;

/**
 *
 * @author Leon
 */
@Service
public class NewServiceImpl implements NewService{

//	@Resource(name="newDaoImpl")
//	private NewDao dao;
	private NewDao dao = new NewDaoImpl();
	
    @Override
    public New findById(int id) {
        return dao.findById(id);
    }

    @Override
    public List<New> findAll() {
        return dao.findAll();
    }

    @Override
    public int findSum() {
        return dao.findAll().size();
    }

    @Override
    public boolean update(New n) {
        if(dao.update(n)!=0)
            return true;
        return false;
    }

    @Override
    public boolean delete(New n) {
        if(dao.delete(n.getId())!=0)
            return true;
        return false;
    }

    @Override
    public boolean add(New t) {
        if(dao.save(t)!=0) 
            return true;
        return false;
    }

    
    @Override
    public List<New> findByRange(int start, int num) {
        return dao.findByRange(start, num);
    }

    @Override
    public List<New> findByDate(Date start, Date end) {
        return dao.findByDate(start, end);
    }

    @Override
    public List<New> findByKey(String str) {
        return dao.findByKey(str);
    }

    @Override
    public List<New> findBySketch(String sketch) {
        return dao.findBySketch(sketch);
    }

    @Override
    public List<New> findByName(String name) {
        return dao.findByName(name);
    }

    @Override
    public Integer getMaxId() {
        return dao.getMaxId();
    }
    
}
