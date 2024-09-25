package com.campusdual.classroom;

public class Car {

    public static final short MAX_SPEED = 120;
    public static final short MIN_SPEED = 0;
    public int tachometer;
    public int speedometer;
    public int wheelsAngle;
    public boolean isRunning;
    public String gear;

    public void start() {
        if (isTachometerEqualToZero() && !isRunning) {
            isRunning = true;
            tachometer = 1000;
            System.out.println("Coche encendido.");
        } else {
            System.out.println("El coche ya está encendido o el tacómetro no está en cero.");
        }
    }

    public boolean isTachometerEqualToZero() {
        return tachometer == 0;
    }

    public boolean isTachometerGreaterThanZero() {
        return tachometer > 0;
    }

}