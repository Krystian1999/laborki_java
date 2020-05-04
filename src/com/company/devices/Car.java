package com.company.devices;

public class Car {


    public String model;
    public String producer;
    public String color;
    public int price = 300;

    public String toString() {
        return model + " " + price + " " + color + " " + producer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setColour(String colour) {
        this.color = colour;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public String getColour() {
        return color;
    }
}
