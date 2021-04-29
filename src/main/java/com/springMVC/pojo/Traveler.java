package com.springMVC.pojo;

import javax.persistence.*;

@Entity
@Table(name = "travelers")
public class Traveler {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Basic
    @Column
    private String firstname;
    private String lastname;
    private String phone;
    private int days;
    private double budget;
    private int adults;
    private int children;

    @OneToOne(mappedBy = "traveler")
    private Trip trip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastName) {
        lastname = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }
}
