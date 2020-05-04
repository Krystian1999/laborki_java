package com.company;



public class Animal {
    String species="dog";
    private Double weight;

    public Animal() {
        this.weight = 20.0;
    }

    void feed(){
        weight+=4;
    }

    void takeForAWalk(){
        if(weight>0) {
            weight -= 4;
            System.out.println("dodaj 1kg");

            System.out.println("moja waga="+weight);
        }else{
            System.out.println("zwierze zdechło z głodu!!!");
        }
    }

    public String toString(){
        return species+" "+weight;
    }
}
