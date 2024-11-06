package com.example.util;

import com.example.geometri.circle;
import com.example.geometri.reigtaingle;

public class Calculator {
    public static void main(String[] args) {
        circle cir = new circle(5.5);

        reigtaingle rei = new reigtaingle(10, 20);
        double cirArea = Math.PI*Math.pow(cir.radius, 2);
        double reiArea = rei.length* rei.breadth;

        System.out.printf("Area of circle : %f , Area of reigtaingular : %f" ,cirArea,reiArea);
    }
}
