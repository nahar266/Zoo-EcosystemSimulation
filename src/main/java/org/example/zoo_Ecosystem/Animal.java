package org.example.zoo_Ecosystem;

public abstract class Animal implements AnimalBehavior {

    public void eat(){
        System.out.println("The animal is eating");
    }
    public void sleep(){
        System.out.println("The animal is sleeping");
    }

    public void makeSound(){
        System.out.println("The animal is making sound");
    }
    public abstract void displayInformation();

}
