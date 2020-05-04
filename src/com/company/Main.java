package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.feed();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.feed();
        animal.feed();
        animal.feed();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();


        Human human = new Human();

        Car bmw1 = new Car();
        bmw1.setColour("red");
        bmw1.setModel("m3");
        bmw1.setPrice(200);
        bmw1.setProducer("BMW");

        Car bmw2 = new Car();
        bmw2.setColour("black");
        bmw2.setModel("e46");
        bmw2.setPrice(400);
        bmw2.setProducer("BMW");

        Car audi = new Car();
        audi.setColour("blue");
        audi.setModel("A4");
        audi.setPrice(600);
        audi.setProducer("Audi");


        human.addMyCar(bmw1);

        System.out.println("________________");
        human.getSalary();

        System.out.println(bmw1.getColour()+" "+bmw1.getModel()+" "+bmw1.getProducer()+"  "+bmw1.getPrice());
        System.out.println("________________");


        System.out.println(bmw1.toString());
        System.out.println(animal.toString());
    }
}
