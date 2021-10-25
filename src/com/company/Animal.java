package com.company;

public class Animal {
    final String species;
    private Double weight;

    public Animal(String species) {
        this.species=species;

        switch(species) {
            case "dog":
                this.weight = 6.0;
                break;
            case "cat":
                this.weight = 2.0;
                break;
            case "monkey":
                this.weight = 35.0;
        }

    }

    void feed() {
        if (this.weight > 0.0) {
            this.weight = this.weight * 1.08;
            System.out.println(this.species +" " + this.weight);
        } else {
            System.out.println("Sorry, pet is dead");
        }

    }

    void takeForWalk() {
        if (this.weight > 0.0) {
            this.weight = this.weight - 0.6;
            if (this.weight > 0.0) {
                System.out.println(this.species + " " + this.weight);
            }
        } else {
            System.out.println("I'm dead");
        }
    }
}
