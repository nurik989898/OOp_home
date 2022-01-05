package com.company;

final public class Volvo extends Car{
    private String model;
    private String frame;


    public Volvo(String model, String frame) {
        this.model = model;
        this.frame = frame;
    }

    public Volvo(String name, String model, String frame) {
        super(name);
        this.model = model;
        this.frame = frame;
    }

    public String getFrame() {
        return frame;
    }

    public String getModel() {
        return model;
    }

    public Volvo(String model) {
        this.model = model;
    }

    @Override
    public void moveKmL() {

    }

    @Override
    public String getInfo() {
        return super.getInfo() +
        "\nName: " + name +
        "\nModel: " + model +
        "\n Type of car: " + frame ;
    }
}
