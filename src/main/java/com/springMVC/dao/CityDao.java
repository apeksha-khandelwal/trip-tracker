package com.springMVC.dao;

import com.springMVC.pojo.City;
import com.springMVC.pojo.User;
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

    public City get(int cityId) throws Exception{
        try {
            begin();
            String sql = "from City where cityId = :id";
            Query q = getSession().createQuery(sql);
            q.setInteger("id", cityId);
            City city = (City) q.uniqueResult();
            commit();
            System.out.println(city.getName());
            return city;
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Could not get city " + cityId, e);
        }
    }
}
