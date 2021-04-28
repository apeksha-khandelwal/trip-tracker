package com.springMVC.dao;

import com.springMVC.pojo.Activity;
import com.springMVC.pojo.City;
import org.hibernate.HibernateException;
import org.hibernate.query.Query;

import java.util.List;

public class ActivityDao extends Dao{

    public List list(int id) throws Exception {
        try {
            begin();
            System.out.println(id+"id in dao");
            String sql = "from Activity where city.id = :city";
//            String sql = "from Activity";
            Query q = getSession().createQuery(sql);
            q.setInteger("city", id);
            List list = q.getResultList();
            commit();
            return list;
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Could not list the categories", e);
        }
    }
}
