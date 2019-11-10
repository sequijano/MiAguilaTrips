/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miaguila.trip.interfaces;

import com.miaguila.trip.TOs.Trip;

/**
 *
 * @author Sergio
 */
public interface ITrips {
    
    public int getTotalTrips();
    public int getTotalTripsbyCity(int city);
    public boolean createTrip(Trip trip);
    public boolean updateTrip(Trip trip);
}
