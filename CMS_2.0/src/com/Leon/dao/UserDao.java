/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.dao;

import com.Leon.pojo.Users;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Leon
 */
public interface UserDao extends BaseDao<Users>{

    @Override
    public List findAll();

    @Override
    public Users findById(Serializable id);

    @Override
    public int delete(Serializable id);

    @Override
    public int update(Users entity);

    @Override
    public int save(Users entity);
    
}
