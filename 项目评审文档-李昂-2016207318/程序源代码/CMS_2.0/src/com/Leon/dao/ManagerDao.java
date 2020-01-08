/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.dao;

import com.Leon.pojo.Manager;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Leon
 */
public interface ManagerDao extends BaseDao<Manager>{

    @Override
    public List findAll();

    @Override
    public Manager findById(Serializable id);

    @Override
    public int delete(Serializable id);

    @Override
    public int update(Manager entity);

    @Override
    public int save(Manager entity);
    
    
}
