package com.company;

public class  Motorcycle extends Vehicle implements Costable{
    private int maxSpeed;
    private int costInfo;


    public Motorcycle(int wheelCount, int maxSpeed, int costInfo){
        super(wheelCount);
        this.maxSpeed=maxSpeed;
        this.costInfo=costInfo;
           }

    @Override
    public  int getCost(){
        return costInfo;
    }


    public void printInfo(){
        System.out.println("Транспортное средство: Мотоцикл - Количество колес: "+ wheelCount+ " ;" + " Максимальная скорость: " + maxSpeed + ";"+"Стоимость :"+costInfo);

    }
}
