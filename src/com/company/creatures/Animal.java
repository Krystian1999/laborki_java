package com.company.creatures;



import com.company.Salleable;

public abstract class Animal implements Feedable {

    public Salleable salleable = new Salleable() {
        @Override
        public void sell(Human seller, Human buyer, Double price) {
            if(buyer.getCash()>=price) {
                if (seller.getPet() == null) {
                    System.out.println("Nie mam zwierzęcia na sprzedaż");
                } else {
                    System.out.println("mam zwierzę na sprzedaż");
                    buyer.setCash(-price);
                    buyer.setPet(seller.getPet());
                    seller.setCash(+price);
                }

                if (seller.getMyCar() == null) {
                    System.out.println("Nie mam samochodu na sprzedaż");
                } else {
                    System.out.println("Mam samochód na sprzedaż");
                }

                if (seller.getPhone() == null) {
                    System.out.println("Nie mam telefonu na sprzedaż");
                } else {
                    System.out.println("Mam telefon na sprzedaż");
                }
            }else {
                System.out.println("nie masz hajsu");
            }


        }

    };


    String species = "dog";
    private Double weight;

    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }

    public Animal() {
        this.weight = 20.0;
    }

    public void feed() {

        weight += 4;


    }

    public   void takeForAWalk() {

        if (weight > 0) {
            weight -= 4;
            System.out.println("dodaj 4kg");

            System.out.println("Moja waga=" + weight);
        } else {
            System.out.println("zwierze zdechło");
        }
    }

    public String toString() {
        return species + " " + weight;
    }
}