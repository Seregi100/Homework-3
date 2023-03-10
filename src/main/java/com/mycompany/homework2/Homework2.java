/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework2;

import java.util.Scanner;

/**
 *
 * @author Seregi
 */
public class Homework2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Работу выполнил Кузьмин Сергей Александрович, РИБО-01-21, вариант 1");
        System.out.println("Введит 0 для легкового автомобиля и 1 для грузового: ");
        int i = scan.nextInt();
        if (i==0){
            System.out.println("Введите максимальную скорость... ");
            int maxSpeed = scan.nextInt();
            System.out.println("потребление топлива на 1 час работы двигателя... ");
            double fuelConsumption = scan.nextDouble();
            System.out.println("пробег... ");
            double carMileage = scan.nextDouble();
            System.out.println("вместимость бака... ");
            int fuelCapasity = scan.nextInt();
            System.out.println("стоимость автомобиля... ");
            int price = scan.nextInt();
            System.out.println("цвет... ");
            String color = scan.next();
            PassengersCar car1 = new PassengersCar(price, color, maxSpeed, fuelConsumption, carMileage, fuelCapasity);
            System.out.println("марка... ");
            String name = scan.next();
            car1.setName(name);
            Autoservice autoservice = new Autoservice();
            autoservice.modify(car1);
            System.out.println(car1.toString());
        } else{
            System.out.println("Введите максимальную скорость... ");
            int maxSpeed = scan.nextInt();
            System.out.println("потребление топлива на 1 час работы двигателя... ");
            double fuelConsumption = scan.nextDouble();
            System.out.println("пробег... ");
            double carMileage = scan.nextDouble();
            System.out.println("вместимость бака... ");
            int fuelCapasity = scan.nextInt();
            System.out.println("стоимость автомобиля... ");
            int price = scan.nextInt();
            System.out.println("цвет... ");
            String color = scan.next();
            Truck car2 = new Truck(price, color, maxSpeed, fuelConsumption, carMileage, fuelCapasity);
            System.out.println("марка... ");
            String name = scan.next();
            car2.setName(name);
            Autoservice autoservice = new Autoservice();
            autoservice.modify(car2);
            System.out.println(car2.toString());
        }
    }
}
