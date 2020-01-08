/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.dao;

import com.Leon.pojo.Product;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Leon
 */
public interface ProductDao extends BaseDao<Product>{

    @Override
    public List findAll();

    @Override
    public Product findById(Serializable id);

    @Override
    public int delete(Serializable id);

    @Override
    public int update(Product entity);

    @Override
    public int save(Product entity);

    public Integer getMaxId();

    
    public List<Product> findByRange(int start, int num);

    public List<Product> findByDate(Date start, Date end);

    public List<Product> findByKey(String str);

    public List<Product> findBySketch(String sketch);

    public List<Product> findByName(String name);

}
