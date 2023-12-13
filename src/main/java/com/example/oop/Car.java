package com.example.oop;

public class Car extends  Vehicle{

    private String brand;

    private boolean hasSoundSystem;

    public Car(int width, int length, String brand) {
        super(width, length, true);
        this.brand = brand;
    }

    @Override
    public String toString(){
        return "Car with " + hasSoundSystem;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return this.brand;
    }
}
