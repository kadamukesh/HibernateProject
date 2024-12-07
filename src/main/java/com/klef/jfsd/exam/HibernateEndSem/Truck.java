package com.klef.jfsd.exam.HibernateEndSem;

import jakarta.persistence.*;

@Entity
public class Truck extends Vehicle {
    @Column(name = "load_capacity")
    private double loadCapacity;

    // Getters and Setters
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
