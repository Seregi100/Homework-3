/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework2;

/**
 *
 * @author Seregi
 */
public class Car {
    private int maxSpeed;
    private double fuelConsumption;
    private double carMileage;
    private int fuelCapasity;

    public Car(int maxSpeed, double fuelConsumption, double carMileage, int fuelCapasity) {
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.carMileage = carMileage;
        this.fuelCapasity = fuelCapasity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getCarMileage() {
        return carMileage;
    }

    public int getFuelCapasity() {
        return fuelCapasity;
    }

    public double maxTimeWithoutRefueling(){
        return this.fuelCapasity*this.fuelConsumption;
    }
    
    public void carMileage(){
        System.out.println(this.carMileage);
    }
    
    public double timeToMaxSpeed(int distance){
        return distance*this.maxSpeed;
    }
}
