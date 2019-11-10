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
public class ITripsImpl implements ITrips{
    
    @Override
    public int getTotalTrips(){
       int totalTrips = 0;       
       //conexión con base de datos 
       //consultar total de viajes
       return totalTrips;
    }
    
    @Override
    public int getTotalTripsbyCity(int city){
       int totalTrips = 0;
       
       //conexión con base de datos 
       //consultar total de viajes por ciudad
       
       return totalTrips;
    }
    
    @Override
    public boolean createTrip(Trip trip){
       //conexión con base de datos  
       //crear nuevo viaje
       return true;
    }
    
    @Override
    public boolean updateTrip(Trip trip){
       //conexión con base de datos  
       //actualizar viaje
       return true;
    }
}
