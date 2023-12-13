package com.example.oop;

public class Engine {
    private int engineVolume;
    private boolean isStarted;

    public String type;

    public boolean getIsStarted(){
        return this.isStarted;
    }

    public void start(){
        this.isStarted = true;
    }

    public void stop(){
        this.isStarted = false;
    }
}
