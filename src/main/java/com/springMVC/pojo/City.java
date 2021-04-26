package com.springMVC.pojo;

import javax.persistence.*;

@Entity
@Table(name = "cities")
public class City {

    @Id
    private int id;
    @Basic
    @Column
    private String name;

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
}
