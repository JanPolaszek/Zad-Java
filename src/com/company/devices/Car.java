package com.company.devices;

public class Car {
    String model;
    String producer;
    public double value;
    Double power_engine;

    public Car (String producer,String model){
        this.producer = producer;
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer){
        this.producer = producer;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String toString(){
        return producer+" "+model;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (producer == null) {
            if (other.producer != null)
                return false;
        }
        else if (!producer.equals(other.producer))
            return false;
        if (model != other.model)
            return false;
        return true;
    }
}


