package com.company;

public abstract class Vehicle {

    protected int wheelCount;

    public Vehicle(int wheelCount){
        this.wheelCount=wheelCount;
    }

    public abstract void printInfo();

}
