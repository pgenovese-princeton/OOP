package com.example.oop;

public class Car extends Object{

    private int length;
    private int width;
    private Engine engine;
    private boolean isStarted;

    public Car(int width, int length){
        this.length = length;
        this.width = width;

        this.engine = new Engine();
    }

    public void drive(){
        if(this.isStarted){
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

    @Override
    public String toString(){
        return this.engine.type + this.length + this.width;
    }

}
