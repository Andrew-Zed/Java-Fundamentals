package com.andrew.upcasting_and_downcasting;

//Up casting and down casting in Java
public class Casting {

    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        Cat cat = new Cat();
        Dog myDog = new Dog();
        doAnimalStuff(cat);
    }

    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        if(animal instanceof Dog) {
            Dog myDog = ( Dog)animal;
            myDog.growl();
        }

    }
}
