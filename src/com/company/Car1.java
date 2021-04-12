package com.company;

public class Car1 implements Costable{
    private int costInfo;

    public Car1(int costInfo){
        this.costInfo=costInfo;
    }
    public  int getCost(){
        return costInfo;
    }
    @Override
    public int printInfo() {
        return costInfo;
    }


}

