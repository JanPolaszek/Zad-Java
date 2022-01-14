package com.company;

import java.util.Date;

public class Human {
    String firstname;
    String lastname;
    Phone phone;
    Car audi;
    private Double salary;

    Double getSalary(){
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
}
