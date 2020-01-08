/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.dao.impl;

import com.Leon.dao.ManagerDao;
import com.Leon.pojo.Manager;
import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;


/**
 *
 * @author Leon
 */
@Repository
public class ManagerDaoImpl extends BaseDaoImpl<Manager> implements ManagerDao{

    @Override
    public List findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Manager findById(Serializable id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Serializable id) {
        return super.delete(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Manager entity) {
        return super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int save(Manager entity) {
        return super.save(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
}
