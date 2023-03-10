/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework2;

/**
 *
 * @author Seregi
 */
public class PassengersCar extends Car {
    private int price;
    private String color;

    public PassengersCar(int price, String color, int maxSpeed, double fuelConsumption, double carMileage, int fuelCapasity) {
        super(maxSpeed, fuelConsumption, carMileage, fuelCapasity);
        this.price = price;
        this.color = color;
    }
    
    public void passengersNumber(int passenersNumber){
        System.out.println(passenersNumber);
    }
    
    @Override
    public String toString() {
        return "Truck{" + "name= " + getName() + ", max speed= " + getMaxSpeed() + ", fuel consumption= " + getFuelConsumption() + ", car mileage= " + getCarMileage() + ", fuel capacity= " + getFuelCapasity() + ", price=" + price + ", color=" + color + '}';
    }
}
