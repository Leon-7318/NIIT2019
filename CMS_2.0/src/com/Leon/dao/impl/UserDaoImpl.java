/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.dao.impl;

import com.Leon.dao.UserDao;
import com.Leon.pojo.Users;
import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

/**
 *
 * @author Leon
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<Users> implements UserDao{

    @Override
    public List findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Users findById(Serializable id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Serializable id) {
        return super.delete(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Users entity) {
        return super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int save(Users entity) {
        return super.save(entity); //To change body of generated methods, choose Tools | Templates.
    }
}
