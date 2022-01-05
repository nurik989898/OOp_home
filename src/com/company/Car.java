package com.company;

public class Car extends Transport{
    private int year;
    private EnumColors enumColors;

    public Car(String Name, int year, EnumColors black) {
    }

    public EnumColors getEnumColors() {
        return enumColors;
    }

    public Car() {
    }

    public int getYear() {
        return year;
    }
    
    final public void moveKm(){
        System.out.println(name + "mashina proehala 100 km");
        }
    public void moveKm(String km){
        System.out.println(km);
    }
     public void moveKmL(){
        System.out.println(name + "  proehala 50km");
    }

    public Car(String name) {
        super(name);
    }
    public String getInfo(){
        return "Name: " + name +
                "\nColor: " + enumColors +
                "\n Year: " + year;

    }
}
