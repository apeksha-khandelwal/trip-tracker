package com.springMVC.pojo;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "trips")
public class Trip {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int tripId;

    @ManyToOne
    @JoinColumn(name ="user")
    private User user;

    @OneToMany(mappedBy = "trip")
    List<TripActivity> tripActivities;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "travelerId", referencedColumnName = "id")
    private Traveler traveler;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city", referencedColumnName = "cityId")
    private City city;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hotelId", referencedColumnName = "id")
    private Hotel hotel;

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user= user;
    }

    public City getCity(){
        return city;
    }

    public void setCity(City city){
        this.city= city;
    }

    public List getActivities() {
        return tripActivities;
    }

    public List<TripActivity> getTripActivities() {
        return tripActivities;
    }

    public void setTripActivities(List<TripActivity> tripActivities) {
        this.tripActivities = tripActivities;
    }

    public Traveler getTraveler() {
        return traveler;
    }

    public void setTraveler(Traveler traveler) {
        this.traveler = traveler;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }
}
