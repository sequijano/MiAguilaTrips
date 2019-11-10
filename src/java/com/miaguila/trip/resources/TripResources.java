/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miaguila.trip.resources;

import com.miaguila.trip.TOs.Trip;
import com.miaguila.trip.interfaces.ITripsImpl;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author Sergio
 */
@Path("/")
public class TripResources {
    ITripsImpl obj = new ITripsImpl();
    
    @GET
    @Path("/trips")
    @Produces("text/plain")
    public int getTotalTrips(){                
        ITripsImpl trips = new ITripsImpl();
        
        return trips.getTotalTrips();
    }
    
    @GET
    @Path("/{idcity}/trips")
    @Produces("text/plain")
    public int getTotalTripsbyCity(int city){
        ITripsImpl trips = new ITripsImpl();
        
        return trips.getTotalTripsbyCity(city);
    }
    
    @POST
    @Path("/trip")
    @Produces("text/plain")
    @Consumes("application/json")
    public boolean createTrip(Trip trip){
        
        return obj.createTrip(trip);
    }
    
    @PUT
    @Path("/trip")
    @Produces("text/plain")
    @Consumes("application/json")
    public boolean updateTrip(Trip trip){
        
        
        return obj.updateTrip(trip);
    }
}
