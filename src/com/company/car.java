package com.company;

import java.awt.*;

public class car extends Vehicle{
    private int wheels;
    private double volume;

    public car(String name, Color color, int i, double v) {
        super(name, color);
        this.wheels = i;
        this.volume = v;

    }
    @Override
    public String getInfo() {
        return (super.getInfo() + " "+ getWheels() + " " + getVolume() );
    }

    @Override
    public void lights() {
        System.out.println("Мигает фарами");
    }

    public final void transmission (String transmission, int number){
        for (int i = 0; i <number ; i++) {
            System.out.println("Переключает коробку передач");
        }
    }

    public int getWheels() {
        return wheels;
    }

    public double getVolume() {
        return volume;
    }
}
