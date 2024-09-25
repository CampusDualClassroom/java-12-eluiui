package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car coche=new Car();
        coche.start();
        coche.start();
        coche.stop();
        coche.accelerate();
        coche.stop();
        coche.brake();
        coche.brake();
        coche.stop();
        coche.start();
        coche.accelerate();
        coche.brake();
        coche.brake();
        coche.turnAngleOfWheels(20);
        coche.turnAngleOfWheels(50);
        coche.setReverse(true);
        coche.accelerate();
        coche.setReverse(true);
    }

}