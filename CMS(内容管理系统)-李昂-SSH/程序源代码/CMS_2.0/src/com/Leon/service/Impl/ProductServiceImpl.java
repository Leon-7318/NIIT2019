/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.service.Impl;
import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Leon.dao.ProductDao;
import com.Leon.dao.impl.ProductDaoImpl;
import com.Leon.pojo.Product;
import com.Leon.service.ProductService;

/**
 *
 * @author Leon
 */
@Service
public class ProductServiceImpl implements ProductService{
    
//	@Resource(name="productDaoImpl")
//    private ProductDao dao;
	private ProductDao dao = new ProductDaoImpl();
	
    @Override
    public Product findById(int id) {
        return dao.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return dao.findAll();
    }

    @Override
    public int findSum() {
        return dao.findAll().size();
    }

    @Override
    public boolean update(Product p) {
        if(dao.update(p)!=0)
            return true;
        return false;
    }

    @Override
    public boolean delete(Product p) {
        if(dao.delete(p.getId())!=0)
            return true;
        return false;
    }

    @Override
    public boolean add(Product p) {
        if(dao.save(p)!=0)
            return true;
        return false;
    }

    @Override
    public List<Product> findByRange(int start, int num) {
        return dao.findByRange(start, num);
    }

    @Override
    public List<Product> findByDate(Date start, Date end) {
        return dao.findByDate(start, end);
    }

    @Override
    public List<Product> findByKey(String str) {
        return dao.findByKey(str);
    }

    @Override
    public List<Product> findBySketch(String sketch) {
        return dao.findBySketch(sketch);
    }

    @Override
    public List<Product> findByName(String name) {
        return dao.findByName(name);
    }

    @Override
    public Integer getMaxId() {
        return dao.getMaxId();
    }
    
}
