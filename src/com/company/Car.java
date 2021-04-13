package com.company;

public class Car extends  Vehicle implements Costable{
    private int doorsCount;
    private int costInfo;



    public Car(int doorsCount, int wheelCount, int costInfo){
        super( wheelCount);
        this.doorsCount = doorsCount;
        this.costInfo = costInfo;
        }

    @Override
    public  int getCost(){
        return costInfo;
    }
    @Override
    public void printInfo(){
        System.out.println("Транспортное средство: Машина - Количество дверей: "+ doorsCount+ "; " +
                "Количество колес: " + wheelCount+ ";"+ " Стоимость: " + costInfo);

    }
}


