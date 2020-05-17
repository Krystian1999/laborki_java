package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) {


        Animal animal = new Pet();
        animal.feed();
        animal.takeForAWalk();
        animal.takeForAWalk();

        Animal animal_1 = new FarmAnimal("cow",200.0);


        Car bmw1 = new Electric();
        bmw1.setColour("red");
        bmw1.setModel("m3");
        bmw1.setPrice(200);
        bmw1.setProducer("BMW");

        Car bmw2 = new LPG();
        bmw2.setColour("black");
        bmw2.setModel("e46");
        bmw2.setPrice(400);
        bmw2.setProducer("BMW");

        Car audi = new Disel();
        audi.setColour("blue");
        audi.setModel("A4");
        audi.setPrice(600);
        audi.setProducer("Audi");

        Human human = new Human();
        human.addMyCar(bmw1);
        human.getSalary();


        System.out.println(human.toString());
        System.out.println(bmw1.toString());
        System.out.println(animal.toString());


        Device device = new Phone();

        device.turnOn();

        Phone phone = new Phone();
        phone.setModel("Samsung");

        Human seller = new Human();
        seller.setPhone(phone);
        seller.setPet(animal);
        seller.setSalary(0.0);

        Human buyer = new Human();
        buyer.setSalary(5000.0);
        buyer.setCash();


        animal.salleable.sell(seller, buyer, 1000.0);
        animal_1.salleable.sell(seller, buyer, 2000.0);
        audi.salleable.sell(seller, buyer, 1000.0);

        System.out.println("buyer money:" + buyer.getCash());
        System.out.println("seller money:" + seller.getCash());

        System.out.println(buyer.pet.toString());
        System.out.println(Phone.serverAddress);
    }
}


