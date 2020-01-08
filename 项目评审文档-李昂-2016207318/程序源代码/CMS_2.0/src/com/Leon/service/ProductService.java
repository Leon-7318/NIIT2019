/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.service;

import com.Leon.pojo.Product;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Leon
 */
public interface ProductService  extends BaseService<Product>{

    @Override
    public Product findById(int id);

    @Override
    public List<Product> findAll();

    @Override
    public int findSum();

    @Override
    public boolean update(Product p);

    @Override
    public boolean delete(Product p);

    @Override
    public boolean add(Product p);

    @Override
    public List<Product> findByRange(int start, int num);

    @Override
    public List<Product> findByDate(Date start, Date end);

    @Override
    public List<Product> findByKey(String str);

    @Override
    public List<Product> findBySketch(String sketch);

    @Override
    public List<Product> findByName(String name);
    
    
}
