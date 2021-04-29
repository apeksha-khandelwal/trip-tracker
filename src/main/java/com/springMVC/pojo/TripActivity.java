package com.springMVC.pojo;

import javax.persistence.*;

@Entity
@Table(name = "tripactivities")
public class TripActivity {

    @EmbeddedId
    TripActivityKey id;

    @ManyToOne
    @MapsId("tripID")
    @JoinColumn(name = "tripId")
    Trip trip;

    @ManyToOne
    @MapsId("activityID")
    @JoinColumn(name = "activityId")
    Activity activity;

    public TripActivity(Trip trip, Activity activity){
        this.activity = activity;
        this.trip = trip;
    }
}
