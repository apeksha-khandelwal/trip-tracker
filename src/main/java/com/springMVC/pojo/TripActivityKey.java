package com.springMVC.pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TripActivityKey implements Serializable {
    @Column(name = "activityID")
    int activityID;

    @Column(name = "tripID")
    int tripID;

    public int getTripID() {
        return tripID;
    }

    public void setActivityID(int studentId) {
        this.activityID = studentId;
    }

    public int getActivityID() {
        return activityID;
    }

    public void setTripID(int tripID) {
        this.tripID = tripID;
    }
}
