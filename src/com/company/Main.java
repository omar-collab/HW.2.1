package com.company;

public class Main {

    public static void main(String[] args) {


        Vehicle v1 = new Vehicle("BMW", Color.RED);
        System.out.println(v1.getInfo());
        v1.lights();
        System.out.println("_________________________");

        car c1 = new car("Audi", Color.Green, 4, 4.2);
        System.out.println(c1.getInfo());
        c1.lights();
        System.out.println("_________________________");

        SportCar SC = new SportCar(" Mersedes", Color.Black, 4, 2.6, 170 );
        System.out.println(SC.getInfo());
        SC.lights();
        System.out.println("_________________________");

    }
}