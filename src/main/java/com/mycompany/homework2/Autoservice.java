/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework2;

/**
 *
 * @author Seregi
 */
public class Autoservice {
    public void modify(Car car){
        String name = car.getName();
        name = name.replace('a', 'o');
        name = name.replace('i', 'e');
        name = name.toLowerCase();
        car.setName(name);
    }
}
