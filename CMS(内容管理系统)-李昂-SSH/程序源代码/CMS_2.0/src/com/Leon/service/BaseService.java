/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.service;

import com.Leon.dao.BaseDao;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author mi
 */
public interface BaseService<T> {
    
    public boolean add(T t);
    
    public boolean delete(T t);
    
    public boolean update(T t);
    
    public int findSum();
    
    public List<T> findAll();
    
    public T findById(int id);
    
    /**
     * 根据标题进行模糊查询
     * @param name
     * @param table
     * @return 一个T的集合
     */
    public List<T> findByName(String name);
    
    /**
     * 根据概要进行模糊查询
     * @param sketch
     * @param table
     * @return 一个T的集合
     */
    public List<T> findBySketch(String sketch);
    
    /**
     * 根据标题和概要进行模糊查询
     * @param str
     * @param table
     * @return 一个T的集合
     */
    public List<T> findByKey(String str);
    
    /**
     * 查找一个时间区间内的T
     * @param start
     * @param end
     * @param table
     * @return 一个T的集合
     */
    public List<T> findByDate(Date start, Date end);
    
    /**
     * 根据区间进行查询
     * @param start 起始下标
     * @param num 查询数量
     * @param table
     * @return 一个T的集合
     */
    public List<T> findByRange(int start, int num);
    
    /**
     * 获取当前的最大ID
     * @return 
     */
    Integer getMaxId();
}
