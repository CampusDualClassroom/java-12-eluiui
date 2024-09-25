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
        if (!isRunning && isTachometerEqualToZero()) {
            isRunning = true;
            tachometer = 1000;
            System.out.println("Coche encendido.");
        } else {
            System.out.println("El coche ya está encendido o el tacómetro no está en cero.");
        }
    }

    // Método para apagar el coche
    public void stop() {
        if (speedometer == 0) {
            isRunning = false;
            tachometer = 0;
            System.out.println("Coche apagado.");
        } else {
            System.out.println("No se puede apagar el coche mientras está en movimiento.");
        }
    }

    public boolean isTachometerEqualToZero() {
        return tachometer == 0;
    }

    public boolean isTachometerGreaterThanZero() {
        return tachometer > 0;
    }

    public void accelerate() {
        if (isRunning) {
            if (speedometer < MAX_SPEED) {
                speedometer += 10;
                System.out.println("Acelerando. Velocidad actual: " + speedometer);
            } else {
                System.out.println("No se puede superar la velocidad máxima.");
            }
        } else {
            System.out.println("El coche no esta encendido");
        }
    }

    // Frenar el coche
    public void brake() {
        if (speedometer > MIN_SPEED) {
            speedometer -= 10;
            if (speedometer < MIN_SPEED) {
                speedometer = MIN_SPEED;
            }
            System.out.println("Frenando. Velocidad actual: " + speedometer);
        } else {
            System.out.println("El coche ya está parado.");
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (wheelsAngle + angle >= -45 && wheelsAngle + angle <= 45) {
            wheelsAngle += angle;
            System.out.println("Girando el volante a: " + wheelsAngle + " grados.");
        } else {
            if (angle > 0) {
                wheelsAngle = 45;
            } else {
                wheelsAngle = -45;
            }
            System.out.println("Giro limitado a: " + wheelsAngle + " grados.");
        }
    }
    public void setReverse(boolean b) {
        if (b) {
            if (speedometer == 0) {
                gear = "R";
                System.out.println("Coche en marcha atras.");
            } else {
                System.out.println("No se puede poner marcha atras porque el coche esta moviendose.");
            }
        }
    }
}