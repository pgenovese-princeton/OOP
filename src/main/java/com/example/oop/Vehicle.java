package com.example.oop;


public class Vehicle implements Servicable, Driveable {

    private int length;
    private int width;
    private Engine engine;

    // composition
    // has-a
    public Vehicle(Engine engine){
        this.engine = engine;
    }

    public Vehicle(int width, int length, boolean hasEngine) {
        this.length = length;
        this.width = width;

        if(hasEngine) {
            this.engine = new Engine();
        }
    }

    private void startEngine(){
        this.engine.start();
    }

    private void turnWheels(){
        // turns the wheels of the car
    }

    public void drive(){

    }


    @Override
    public void steer() {

    }

    @Override
    public void accelerate() {

    }

    public void brake(){

    }

    @Override
    public void replaceTires() {

    }

    @Override
    public void changeOil() {

    }
}
