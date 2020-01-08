/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Leon.dao;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * 创建一个BaseDao接口，定义所有Dao可以继承的公共常用操作<br>
 * 如基本的增删改查 其他Dao接口继承自该接口，然后根据需要扩展自己的方法定义即可<br>
 * 这里创建的接口是泛型接口,T是一个类型参数，表示接口中操作的对象的类型，后续根据需求将T换成对应类型即可<br>
 * 如果操作的是Student类，则T表示Student，如果操作的是Product类，T表示Product对象<br>
 *
 * @author Leon
 */
public interface BaseDao<T> {

    /**
     * save一个对象，也就是插入一条数据到数据库
     *
     * @param entity 表示要保存的实体对象，携带要插入的记录的所有信息
     * @return 返回一个整数表示插入数据受影响的行数，成功返回1，否则返回0
     */
    int save(T entity);

    /**
     * 更新一个对象，也就是更新一条记录，该方法用于更新
     *
     * @param entity 表示要更新的实体对象，携带要更新的记录的信息
     * @return 返回一个整数表示插入数据受影响的行数，成功返回1，否则返回0
     */
    int update(T entity);

    /**
     * 删除一个对象，也就是从数据库根据主键删除一条记录
     *
     * @param id 主键的值
     * @return 返回一个整数表示插入数据受影响的行数，成功返回1，否则返回0
     */
    int delete(Serializable id);

    /**
     * 根据主键的值查询单个对象
     *
     * @param id
     * 主键的值，之所以这里用Serializable类型，是因为hibernate的get(),load()等接受Serializable类型主键值
     * @return
     */
    T findById(Serializable id);

    /**
     * 查询所有记录
     *
     * @return 包含所有记录的数据列表
     */
    List findAll();

    /**
     * 查询当前的最大ID
     * @return 
     */
    Integer getMaxId(String table);
    
       /**
     * 根据标题进行模糊查询
     * @param name
     * @param table
     * @return 一个发布会的集合
     */
    public List<T> findByName(String name,String table);
    
    /**
     * 根据概要进行模糊查询
     * @param sketch
     * @param table
     * @return 一个发布会的集合
     */
    public List<T> findBySketch(String sketch,String table);
    
    /**
     * 根据标题和概要进行模糊查询
     * @param str
     * @param table
     * @return 一个发布会的集合
     */
    public List<T> findByKey(String str,String table);
    
    /**
     * 查找一个时间区间内的发布会
     * @param start
     * @param end
     * @param table
     * @return 一个发布会的集合
     */
    public List<T> findByDate(Date start, Date end,String table);
    
    /**
     * 根据区间进行查询
     * @param start 起始下标
     * @param num 查询数量
     * @param table
     * @return 一个发布会的集合
     */
    public List<T> findByRange(int start, int num,String table);
    
    
    /**
     * 根据指定的查询语句和参数获得数据列表
     *
     * @param hql 要执行的hql查询
     * @param params hql查询中参数的值，为了让方法更通用，没有限制参数数量，所以用了可变参数, Obejct...表示参数是任意多个对象
     * @return 一个数据列表，根据查询的结果，返回对应的类型
     */
    List findListByHQL(String hql, Object... params);

    /**
     * 根据要执行的查询，因为很多功能需要分页，所以添加了该功能作为一个常用功能
     *
     * @param hql 要执行的hql查询
     * @param pageNo 页码，查询第几页的数据
     * @param pageSize 页面大小，也就是查询几条记录作为当前页的记录
     * @param params 如果要执行的查询需要参数，给出参数列表
     * @return 包含指定页面指定记录的数据列表f
     */
    List findListByPageNo(String hql, int pageNo, int pageSize, Object... params);

}
