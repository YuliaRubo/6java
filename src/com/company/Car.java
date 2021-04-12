package com.company;

public class Car extends  Vehicle {
    private int doorsCount;



    public Car(int doorsCount, int wheelCount){
        super( wheelCount);
        this.doorsCount = doorsCount;
        }
    @Override
    public void printInfo(){
        System.out.println("Транспортное средство: Машина - Количество дверей: "+ doorsCount+ "; " + "Количество колес: " + wheelCount);

    }
}


