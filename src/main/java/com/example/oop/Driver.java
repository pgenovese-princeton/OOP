package com.example.oop;


import com.intellij.util.containers.SortedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Driver {
    public static void main(String args[]){

        Car workCar = new Car(4, 8);

        Car personalCar = new Car(2, 6);

        Truck workTruck = new Truck(8, 16);

        // this Arrays.asList is a ~static function~, consider it magic for creating a List, for now
        List<Vehicle> listOfMyCars = Arrays.asList(workCar, personalCar, workTruck);

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
