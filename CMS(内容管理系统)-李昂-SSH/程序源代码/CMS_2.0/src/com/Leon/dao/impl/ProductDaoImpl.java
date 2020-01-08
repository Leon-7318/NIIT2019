/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.dao.impl;

import com.Leon.dao.ProductDao;
import com.Leon.pojo.Product;
import com.Leon.util.HibernateUtil;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leon
 */
@Repository
public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao{

    @Override
    public List findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product findById(Serializable id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Serializable id) {
        return super.delete(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Product entity) {
        return super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int save(Product entity) {
        return super.save(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> findByRange(int start, int num) {
        return findByRange(start,num,"Product");
    }

    @Override
    public List<Product> findByDate(Date start, Date end) {
        return findByDate(start, end,"Product");
    }

    @Override
    public List<Product> findByKey(String str) {
        return findByKey(str,"Product");
    }

    @Override
    public List<Product> findBySketch(String sketch) {
        return findBySketch(sketch,"Product");
    }

    @Override
    public List<Product> findByName(String name) {
        return findByName(name,"Product");
    }

    @Override
    public Integer getMaxId() {
        return getMaxId("Product");
    }
    
}
