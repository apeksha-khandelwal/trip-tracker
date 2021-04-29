package com.springMVC.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "hotels")
public class Hotel implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Basic
    @Column
    private String name;
    @Column(name = "`date`")
    private String date;
    private String checkin;
    private String checkout;
    @Column(columnDefinition = "TINYINT(1) default '1'")
    private boolean breakfast;
    @Column(columnDefinition = "TINYINT(1) default '1'")
    private boolean lunch;
    @Column(columnDefinition = "TINYINT(1) default '1'")
    private boolean dinner;

//    @OneToOne(mappedBy = "hotel")
//    private Trip trip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public boolean isLunch() {
        return lunch;
    }

    public void setLunch(boolean lunch) {
        this.lunch = lunch;
    }

    public boolean isDinner() {
        return dinner;
    }

    public void setDinner(boolean dinner) {
        this.dinner = dinner;
    }
}
