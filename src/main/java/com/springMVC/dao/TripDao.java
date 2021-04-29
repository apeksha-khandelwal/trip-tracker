package com.springMVC.dao;

import com.springMVC.pojo.Trip;
import com.springMVC.pojo.TripActivity;
import org.hibernate.HibernateException;
import org.hibernate.query.Query;

import java.util.List;

public class TripDao extends Dao{
    public int create(Trip trip) throws Exception {
        try {
            begin();
            System.out.println(trip);
            int id = (int) getSession().save(trip);
            System.out.println(trip.getUser().getFirstname());
            commit();
            return id;
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Exception while creating user: " + e);
        }
    }

    public List list() throws Exception {
        try {
            begin();
            String sql = "from Trip";
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
