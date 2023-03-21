package com.example.oop;

public class Vehicle {

    private int length;
    private int width;
    private Engine engine;

    public Vehicle(Engine engine){
        this.engine = engine;
    }

    public Vehicle(int width, int length, boolean hasEngine){
        this.length = length;
        this.width = width;

        if(hasEngine){
            this.engine = new Engine();
        }
    }

    public void drive(){
        if(this.engine != null){
            startEngine();
        }
        turnWheels();
    }

    private void startEngine(){
        this.engine.start();
    }

    private void turnWheels(){
        // turns the wheels of the car
    }


}
