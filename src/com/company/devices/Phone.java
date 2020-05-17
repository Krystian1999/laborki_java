package com.company.devices;

import com.company.creatures.Human;
import com.company.Salleable;

import java.util.List;

public class Phone extends Device {


    public String model;
    public static final String appName = "apka";
    public static final String version = "1.0";
    public static final String serverAddress = "666";
    public List<String> appList;
    public URL url;
    public static


    Salleable salleable = new Salleable() {
        @Override
        public void sell(Human seller, Human buyer, Double price) {
            if (buyer.getCash() >= price) {
                if (seller.getPet() == null) {
                    System.out.println("Nie mam zwierzęcia na sprzedaż");
                } else {
                    System.out.println("Mam zwierzę na sprzedaż");

                }

                if (seller.getMyCar() == null) {
                    System.out.println("Nie mam samochodu na sprzedaż");
                } else {
                    System.out.println("Mam samochód na sprzedaż");
                }

                if (seller.getPhone() == null) {
                    System.out.println("Nie mam telefonu na sprzedaż");
                } else {
                    buyer.setCash(-price);
                    buyer.setPhone(seller.getPhone());
                    seller.setCash(+price);
                }
            } else {
                System.out.println("Nie masz hajsu");
            }

        }


    };

    public Phone() {

    }

    public String toString() {
        return "";
    }

    @Override
    public boolean turnOn() {
        System.out.println("Włącz telefon");
        return true;
    }

    public String getModel() {
        return model;
    }

    public String installAnnApp(String appName) {

        return appName;
    }

    public String installAnnApp(String appName, String version) {

        return appName + version;
    }

    public String installAnnApp(String appName, String version, String serverAddress) {

        return appName + version + serverAddress;
    }

    public String installAnnApp(List<String> appList) {

        return appList.toString();
    }

    public String installAnnApp(URL url) {

        return url.toString();
    }


    public void setModel(String model) {
        this.model = model;
    }
}
