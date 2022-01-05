package com.company;

public class Main {

    public static void main(String[] args) {
	Car car = new Car("no",1234,EnumColors.BLUE);
        System.out.println(car.getInfo());
   car.moveKmL();
        System.out.println("_______________________");
   Volvo volvo = new Volvo("BMW","M3","suv");
        System.out.println(volvo.getInfo());

    }
}
