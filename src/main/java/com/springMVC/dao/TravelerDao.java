package com.springMVC.dao;

import com.springMVC.pojo.Hotel;
import com.springMVC.pojo.Traveler;
import org.hibernate.HibernateException;

public class TravelerDao extends Dao{
    public Traveler create(Traveler traveler) throws Exception {
        try {
            begin();
            getSession().save(traveler);
            commit();
            return traveler;
        } catch (HibernateException e) {
            throw new Exception("Exception while creating user: " + e);
        }
    }
}
