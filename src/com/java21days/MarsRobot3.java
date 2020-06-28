package com.java21days;

public class MarsRobot3 {
    String status;
    int speed;
    float temperature;

    //add Constructor
    MarsRobot3(String inStatus, int inSpeed, float inTemperature) {
        status = inStatus;
        speed = inSpeed;
        temperature = inTemperature;
    }    
    
    void checkTemperature() {
        if (temperature < -80) {
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }
    
    public static void main(String[] arguments) {
        MarsRobot3 spirit = new MarsRobot3("exploring", 2, -80);
        spirit.showAttributes();
        System.out.println("Increasing speed to 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Changing temperature to -100.");
        spirit.temperature = -100;
        spirit.showAttributes();
        System.out.println("Checking the temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();
    }
}
