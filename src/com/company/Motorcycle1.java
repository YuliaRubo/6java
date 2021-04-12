package com.company;

public class Motorcycle1 implements Costable{
    private int costInfo;

    public Motorcycle1(int costInfo){
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
