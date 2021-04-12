package com.company;

public class Main {

    public static void main(String[] args) {
    Car carOne = new Car(4, 4);
    carOne.printInfo();
    Motorcycle motOne = new Motorcycle(2,250);
    motOne.printInfo();

    Car1 carTwo = new Car1(250);
        System.out.println("Стоимость машины:" + carTwo.printInfo());

    Motorcycle1 motTwo = new Motorcycle1(350);
        System.out.println("Стоимость мото:" + motTwo.printInfo());


	// write your code here
    }
}
