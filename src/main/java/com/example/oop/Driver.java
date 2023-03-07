package com.example.oop;


public class Driver {
    public static void main(String args[]){

        Car workCar = new Car(4, 8);

        Car personalCar = new Car(2, 6);

        boolean atWork = false;

        if(atWork){
            workCar.drive();
        }
        else {
            personalCar.drive();
        }

        System.out.println(workCar.toString());
    }
}
