package com.Leon.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.sql.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Leon.dao.BaseDao;
import com.Leon.util.HibernateUtil;

/**
 * BaseDao接口的实现类，因为BaseDao是泛型接口，所以BaseDaoImpl自然是泛型类<br>
 * 也因为在BaseDao和BaseDaoImpl中定义公共操作，所以还没有具体操作的对象类型，所以泛化<br>
 * 等到设计具体的Dao接口和Dao类的时候，可以将类型具体化 <br>
 *
 * @author Leon
 */

public class BaseDaoImpl<T> implements BaseDao<T> {

    private Class<T> clazz; //定义一个变量，用于保存获取的T的类型

    public BaseDaoImpl() { //在构造函数中获取clazz表示的T的类型,最后T保存类型，如实Student.class还是Product.class
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        clazz = (Class<T>) type.getActualTypeArguments()[0];
    }

    @Override
    public int save(T entity) {
        Session session = null;
        Transaction tx = null;
        int rows = 0;
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            session.save(entity);
            tx.commit();
            rows = 1; //如果成功没问题，受影响行数为1
        } catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null) {
                tx.rollback(); //如果出现异常且事务对象不为null，回滚事务
            }
        } finally {
            HibernateUtil.close(session);
        }
        return rows;
    }

    @Override
    public int update(T entity) {
        Session session = null;
        Transaction tx = null;
        int rows = 0;
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            session.update(entity);
            tx.commit();
            rows = 1;
        } catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null) {
                tx.rollback(); //如果出现异常且事务对象不为null，回滚事务
            }
        } finally {
            HibernateUtil.close(session);
        }
        return rows;
    }

    @Override
    public int delete(Serializable id) {
        Session session = null;
        Transaction tx = null;
        int rows = 0;
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            T object = (T) session.get(clazz, id); //根据主键获取单个对象
            session.delete(object); //删除查到的对象
            tx.commit();
            rows = 1;
        } catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            if (session != null) {
                HibernateUtil.close(session);
            }
        }
        return rows;
    }

    @Override
    public T findById(Serializable id) {
        Session session = null;
        Transaction tx = null;
        T object = null;
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            object = (T) session.get(clazz, id); //根据主键获取单个对象
            tx.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            HibernateUtil.close(session);
        }
        return object;
    }

    @Override
    public List findListByHQL(String hql, Object... params) {
        List list = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            Query query = session.createQuery(hql);
            //设置各个参数的值,查询的时候使用?1,?2设置参数，多个参数用数组的形式被接收，然后遍历数组取出每个参数设置值
            //因为设置参数使用?1.?2，所以参数索引从1开始
            for (int i = 0; params != null && i <params.length; i++) {
                query.setParameter(i+1, params[i]);
            }
            list = query.list();
            tx.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            HibernateUtil.close(session);
        }
        return list;
    }

    @Override
    public List findListByPageNo(String hql, int pageNo, int pageSize, Object... params) {
        List list = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            Query query = session.createQuery(hql);
            //设置各个参数的值
            for (int i = 0; params != null && i <params.length; i++) {
                query.setParameter(i+1, params[i]);
            }
            //获取指定页面的指定条记录
            list = query.setFirstResult((pageNo - 1) * pageSize).setMaxResults(pageSize).list();
            tx.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            HibernateUtil.close(session);
        }
        return list;
    }

    @Override
    public List findAll() {
        List list = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            Criteria query=session.createCriteria(clazz); //这里使用了条件查询，用于指定要查询的类实现查询对象
            list=query.list();
            tx.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            HibernateUtil.close(session);
        }
        return list;
    }

    @Override
    public List<T> findByName(String name,String table) {
       Session session=HibernateUtil.getSession();
       Query query = session.createQuery("from "+table+" where name like :n");
       query.setParameter("n", "%"+name+"%");
       List<T> res = query.list();
       HibernateUtil.close(session); 
       return res;
    }

    @Override
    public List<T> findBySketch(String sketch,String table) {
        Session session=HibernateUtil.getSession();
        Query query = session.createQuery("from "+table+" where sketch like :sketch");
        query.setParameter("sketch", "%"+sketch+"%");
        List<T> res = query.list();
        HibernateUtil.close(session); 
        return res;
    }

    @Override
    public List<T> findByKey(String str,String table) {
        Session session=HibernateUtil.getSession();
        Query query = session.createQuery("from "+table+" where name like :str or sketch like :str");
        query.setParameter("str", "%"+str+"%");
        List<T> res = query.list();
        HibernateUtil.close(session); 
        return res;
    }

    @Override
    public List<T> findByDate(Date start, Date end,String table) {
        Session session=HibernateUtil.getSession();
        Query query = session.createQuery("from "+table+" where date between :start and :end");
        query.setParameter("start", start);
        query.setParameter("end", end);
        List<T> res = query.list();
        HibernateUtil.close(session); 
        return res;
    }

    @Override
    public List<T> findByRange(int start, int num,String table) {
        Session session=HibernateUtil.getSession();
        Query query = session.createQuery("from "+table);
        query.setFirstResult(start); //设置第一条记录的索引,索引从0开始
        query.setMaxResults(num); //设置检索的记录条数
        List<T> res = query.list();
        HibernateUtil.close(session); 
        return res;
    }

    @Override
    public Integer getMaxId(String table) {
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("select max(id) from "+table);
        List<Integer> list=query.list();
        HibernateUtil.close(session);
        return list.get(0);
    }
}
