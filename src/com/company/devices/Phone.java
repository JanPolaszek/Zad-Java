package com.company.devices;


public class Phone extends Device{


    public Phone(String producer,String model,Integer yearOfProduction){
        super(producer,model,yearOfProduction);

        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    //public String toString(){
     //   return producer +" "+ model;
    //}

    @Override
    public void turnOn() {
        System.out.println("Włącz");
    }

}
