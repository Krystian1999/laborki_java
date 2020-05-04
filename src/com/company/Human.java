package com.company;


import com.company.devices.Car;

import java.util.Date;

public class Human {

    Animal pet;
    private Car myCar;
    Double salary;

    Date date = new Date();

public String toString(){
    return pet+" "+myCar+"  "+salary;
}
    void addMyCar(Car car) {
        this.myCar = car;
    }

    public Double setSalary(Double salary) {

        if (salary < 0) {
            System.out.println("wartosc musi byc dodatnia");
        } else {
            System.out.println("Wplata wysłana  do bookowania");
            System.out.println("Prosze odebrac potwierdzenie");
            System.out.println("Zus i US odnotowały wpłate ");

            return salary;
        }
        return salary;
    }

    public Animal getPet() {
        return pet;
    }

    public Car getMyCar() {
        return myCar;
    }

    public void setMyCar(Car myCar) {
        if(salary>=myCar.price) {
            System.out.println("mozesz kupic samochod!");
            addMyCar(myCar);
        }else if (salary>(myCar.price/12)){
            System.out.println("mozesz kupic samochod na kredyt");
            addMyCar(myCar);
        }else {
            System.out.println("nie masz pieniedzy,jestes biedny");
        }
    }

    public Double getSalary() {
        System.out.println(date + " " + " " + salary);
        return salary;
    }
}
