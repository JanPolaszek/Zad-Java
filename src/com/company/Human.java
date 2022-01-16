package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human {
    String firstname;
    String lastname;
    Phone phone;
    private Car car;
    private Double salary;

    public Double getSalary(){
        System.out.println(salary + " - " + new Date());
        return salary;
    }

    public void setSalary(double change_salary) {
        this.salary = change_salary;

        if (change_salary > 0){
            System.out.println("Wynagrodzenie nie powinno być poniżej zera");
        }
        else
        {
            System.out.println(change_salary);
            System.out.println("Dane zostały wysłane do systemu księgowego");
            System.out.println("Odbierz aneks do umowy");
            System.out.println("ZUS i US wiedzą o zmianie wypłaty");
        }
    }

    public Car getCar(){
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
        if( salary> car.value ){
            System.out.println("Kupiłeś samochód za gotówkę");
        }
        else if(salary>(car.value/12)){
        System.out.println("Kupiłeś samochód na kredyt");
        }
        else{
            System.out.println("Zmień prace,idz po podwyżke");
        }
    }
}
