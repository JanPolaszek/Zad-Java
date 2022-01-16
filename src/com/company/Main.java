package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");

        Human jan = new Human();

        Car car1 = new Car("Ferrari","Italia");
        Car car2 = new Car("Ferrari","Italia");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));
        System.out.println("-----------------");
        Phone phone1 = new Phone("Samsung","Galaxy");
        Phone phone2 = new Phone("Iphone","XS");
        System.out.println(phone1);
        System.out.println(phone2);







    }
}
