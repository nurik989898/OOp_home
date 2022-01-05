package com.company;

public class Main {

    public static void main(String[] args) {
	Car car = new Car("Volvo",2020,EnumColors.BLUE);
        System.out.println(car.getInfo());
   car.moveKmL();
        System.out.println("_______________________");
   Volvo volvo = new Volvo("BMW",2020,EnumColors.PURPLE,"M3","Sedan");
        System.out.println(volvo.getInfo());
        System.out.println("____________________");
        Volvo lov = new Volvo("BMW", 2022,EnumColors.BLACK,"X5","SUV");
        System.out.println(lov.getInfo());
        lov.moveKm();

    }
}
