package com.company.devices;

public abstract class Device {
    String producer;
    String model;
    Integer yearOfProduction;


    public Device(String producer, String mode, Integer yearOfProduction) {
        this.producer = producer;
        this.model = mode;
        this.yearOfProduction = yearOfProduction;
        }

    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }

    public abstract void turnOn();
}