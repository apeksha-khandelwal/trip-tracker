package com.springMVC.dao;

import com.springMVC.pojo.User;
import org.hibernate.HibernateException;
import org.hibernate.query.Query;

public class UserDaoImpl extends UserDao{

    public User get(String username) throws Exception{
        try {
            begin();
            String sql = "from User where username = :name";
            Query q = getSession().createQuery(sql);
            q.setString("name", username);
            User user = (User) q.uniqueResult();
            commit();
            System.out.println(user.getFirstname());
            return user;
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Could not get user " + username, e);
        }
    }

    public User create(User user) throws Exception {
        try {
            begin();
            System.out.println(user.getFirstname());
            getSession().save(user);
            System.out.println(user.getFirstname());
            commit();
            return user;
        } catch (HibernateException e) {
            rollback();
            throw new Exception("Exception while creating user: " + e.getMessage());
        }
    }
}
