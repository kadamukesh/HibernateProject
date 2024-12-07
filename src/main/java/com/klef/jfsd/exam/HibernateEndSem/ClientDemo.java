package com.klef.jfsd.exam.HibernateEndSem;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction t = session.beginTransaction();

        // Create Vehicle
        Vehicle v = new Car();
        v.setName("Generic Vehicle");
        v.setType("Basic");
        v.setMaxSpeed(100);
        v.setColor("White");

        // Create Car
        Car car = new Car();
        car.setName("Sedan");
        car.setType("Passenger");
        car.setMaxSpeed(180);
        car.setColor("Red");
        car.setNumberOfDoors(4);

        // Create Truck
        Truck truck = new Truck();
        truck.setName("Freight Truck");
        truck.setType("Cargo");
        truck.setMaxSpeed(120);
        truck.setColor("Blue");
        truck.setLoadCapacity(15.5);

        // Persist the objects
        session.persist(v);
        session.persist(car);
        session.persist(truck);

        t.commit();
        System.out.println("Records inserted successfully!");

        session.close();
        sf.close();
    }
}
