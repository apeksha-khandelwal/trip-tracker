package com.springMVC.pojo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int cityId;
    @Basic
    @Column
    private String name;

    @OneToMany(mappedBy = "city")
    private List<Activity> activities;

    @OneToOne(mappedBy = "city")
    private Trip trip;

    public List getActivities() {
        return activities;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
