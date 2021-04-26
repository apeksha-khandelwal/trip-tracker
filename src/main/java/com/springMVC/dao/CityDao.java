package com.springMVC.dao;

import org.hibernate.HibernateException;
import org.hibernate.query.Query;

import java.util.List;

public class CityDao extends Dao {

    public List list() throws Exception {
        try {
            begin();
            String sql = "from City";
            Query q = getSession().createQuery(sql);
            List list = q.getResultList();
            commit();
            return list;
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Could not list the categories", e);
        }
    }
}
