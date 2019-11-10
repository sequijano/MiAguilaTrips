/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miaguila.trip.TOs;

/**
 *
 * @author Sergio
 */
public class Reference {
    private Date date;
    private String pickup_address;
    private Location pickup_location;

    public Reference() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPickup_address() {
        return pickup_address;
    }

    public void setPickup_address(String pickup_address) {
        this.pickup_address = pickup_address;
    }

    public Location getPickup_location() {
        return pickup_location;
    }

    public void setPickup_location(Location pickup_location) {
        this.pickup_location = pickup_location;
    }
    
    
}
