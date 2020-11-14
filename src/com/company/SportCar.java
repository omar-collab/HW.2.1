package com.company;

public class SportCar extends Vehicle{

    private double speed;
    private int wheels;
    public SportCar(String name, Color color, int i, double s, int i1) {
        super(name, color);
        this.wheels= i;
        this.speed = s;


    }
    @Override
    public String getInfo() {
        return (super.getInfo()+ " " + getWheels()+ " " + getSpeed());
    }

    @Override
    public void lights() {
        System.out.println("Переключает скорость");
    }

    public double getSpeed() {
        return speed;
    }

    public int getWheels() {
        return wheels;
    }
}
