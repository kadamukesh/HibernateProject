package com.klef.jfsd.exam.HibernateEndSem;

import jakarta.persistence.*;

@Entity
public class Car extends Vehicle {
    @Column(name = "number_of_doors")
    private int numberOfDoors;

    // Getters and Setters
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
