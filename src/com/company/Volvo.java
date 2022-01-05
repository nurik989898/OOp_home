package com.company;

final public class Volvo extends Car {
    private String model;
    private String frame;

    public Volvo(String name, int year, EnumColors enumColors, String model, String frame) {
        super(name, year, enumColors);
        this.model = model;
        this.frame = frame;
    }

    public String getFrame() {
        return frame;
    }

    public String getModel() {
        return model;
    }


    @Override
    public void moveKmL() {

    }

    @Override
    public String getInfo() {
            return super.getInfo() +
                    "\nModel: " + model +
                    "\n Type of car: " + frame;
        }
    }