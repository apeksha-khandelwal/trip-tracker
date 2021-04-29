package com.springMVC.dao;

import com.springMVC.pojo.Trip;
import com.springMVC.pojo.TripActivity;
import org.hibernate.HibernateException;

import java.util.List;

public class TripActivityDao extends Dao{

    public TripActivity createTripActivity(TripActivity tripActivity) throws Exception {
        try {
            begin();
            getSession().save(tripActivity);
//            System.out.println(tripActivity.getUser().getFirstname());
            commit();
            return tripActivity;
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Exception while creating user: " + e.getMessage());
        }
    }
}
