/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pnnq.service;

/**
 *
 * @author Như Quỳnh
 */
public class bmiservice {

    public static int tinhBmi(double chieuCao, double canNang) {
        double bmi = canNang/Math.pow(chieuCao, 2);
        
        if(bmi<18.5){
            return 1;
        }
        else if(bmi<25){
            return 2;
        }
        else 
            return 3;
    }
}
