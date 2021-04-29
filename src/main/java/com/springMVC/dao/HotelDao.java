package com.springMVC.dao;

import com.springMVC.pojo.Hotel;
import com.springMVC.pojo.User;
import org.hibernate.HibernateException;

public class HotelDao extends Dao{

    public Hotel create(Hotel hotel) throws Exception {
        try {
            begin();
            getSession().save(hotel);
            commit();
            return hotel;
        } catch (HibernateException e) {
            throw new Exception("Exception while creating user: " + e);
        }
    }
}
