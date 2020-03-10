package com.company;

// Mubarik Abdi 3/10/2020

// the object person1 is created from the implementation Person class which extends from Contact

// Contact class is abstract so if you want to create an object from it, you need the help of another
// class/implementation

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello");

        Contact person1 = new Person("Jamail@gmail.com","Jay");

        person1.contact();

        Contact adult1 = new Adult("Jamison", "614-135-1254");

        System.out.println("--------------------------");
        adult1.contact();
    }
}
