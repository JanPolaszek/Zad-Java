package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");

        Human jan = new Human();

        Car car1 = new Car("Ferrari","Italia",2022);
        Car car2 = new Car("Ferrari","Italia",2012);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));
        System.out.println("-----------------");
        Phone phone1 = new Phone("Samsung","Galaxy",2018);
        Phone phone2 = new Phone("Iphone","XS",2019);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println("-=-=-=-=-=-=-=-=-");
        phone1.turnOn();
        System.out.println(phone1);







    }
}
