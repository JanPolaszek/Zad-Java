package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");

        Human jan = new Human();

        Car ferro = new Car("Ferrari","Italia");
        jan.setSalary(24300.99);
        jan.getSalary();

        ferro.value = 2333;
        jan.setCar(ferro);
        jan.getCar();



    }
}
