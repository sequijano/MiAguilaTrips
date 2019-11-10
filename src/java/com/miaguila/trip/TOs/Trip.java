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
public class Trip {
    private Reference start;
    private Reference end;
    private Country country;
    private City city;
    private Passenger passenger;
    private Driver driver;
    private Car car;
    private String status;
    private String check_code;
    private Date createdAt;
    private Date updatedAt;
    private float price;
    private Location driver_location;

    public Trip() {
    }

    public Reference getStart() {
        return start;
    }

    public void setStart(Reference start) {
        this.start = start;
    }

    public Reference getEnd() {
        return end;
    }

    public void setEnd(Reference end) {
        this.end = end;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCheck_code() {
        return check_code;
    }

    public void setCheck_code(String check_code) {
        this.check_code = check_code;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Location getDriver_location() {
        return driver_location;
    }

    public void setDriver_location(Location driver_location) {
        this.driver_location = driver_location;
    }
    
    
    
}
