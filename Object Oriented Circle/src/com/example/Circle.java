package com.example;

import java.util.Scanner;

public class Circle {
    private double diameter,radius,perimeter;
    private final double pi=3.14;

    public void setDiameter(double _diameter){
        if(_diameter >0){
            this.diameter=_diameter;

        }else{
            System.out.println("Invalid input");
        }
    }

        public double computePerimeter(){
        radius=diameter/2;
        perimeter=2*pi*radius;
        return perimeter;
    }
}
