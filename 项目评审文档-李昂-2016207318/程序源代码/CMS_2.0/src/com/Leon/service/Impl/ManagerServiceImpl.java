/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.Leon.dao.ManagerDao;
import com.Leon.dao.impl.ManagerDaoImpl;
import com.Leon.pojo.Manager;
import com.Leon.service.ManagerService;

/**
 *
 * @author Leon
 */
@Service
public class ManagerServiceImpl implements ManagerService{

//	@Resource(name="managerDaoImpl")
//	private ManagerDao dao;
	private ManagerDao dao = new ManagerDaoImpl();
	
    @Override
    public boolean Login(String id, String pass) {
        Manager m = dao.findById(id);
        if(null != m && m.getPassword().equals(pass))
            return true;
        return false;
    }

    @Override
    public boolean register(Manager m) {
        if(null == dao.findById(m.getName()) && dao.save(m)==1)
            return true;
        return false;
    }

    @Override
    public boolean modifyInfo(Manager m) {
        if(dao.update(m)==1)
            return true;
        return false;
    }

    @Override
    public Manager getManager(String id) {
        return dao.findById(id);
    }
    
}
