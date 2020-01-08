/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.service.Impl;

import com.Leon.dao.UserDao;
import com.Leon.dao.impl.UserDaoImpl;
import com.Leon.pojo.Users;
import com.Leon.service.UserService;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 *
 * @author Leon
 */
@Service
public class UserServiceImpl implements UserService{

//	@Resource(name="userDaoImpl")
//    private UserDao dao;

	private UserDao dao = new UserDaoImpl();
	
    @Override
    public boolean Login(String id, String pass) {
        Users u = dao.findById(id);
        if(null != u && u.getPassword().equals(pass))
            return true;
        return false;
    }

    @Override
    public boolean register(Users u) {
        if(null == dao.findById(u.getName()) && dao.save(u) == 1)
            return true;
        return false;
    }

    @Override
    public boolean modifyInfo(Users u) {
        if(dao.update(u) == 1)
            return true;
        return false;
    }

    @Override
    public Users getUser(String id) {
        return dao.findById(id);
    }

    @Override
    public List<Users> findAll() {
        return dao.findAll();
    }
    
}
