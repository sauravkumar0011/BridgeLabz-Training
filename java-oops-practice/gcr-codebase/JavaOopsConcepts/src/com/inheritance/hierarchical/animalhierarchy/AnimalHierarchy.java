package com.inheritance.hierarchical.animalhierarchy;

public class AnimalHierarchy {

    public static void main(String[] args) {

        //Polymorphism: parent reference holding child objects
        Animal animal1 = new Dog("Bunny", 4);
        Animal animal2 = new Cat("catel", 1);
        Animal animal3 = new Bird("feety", 3);

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
    }
}
