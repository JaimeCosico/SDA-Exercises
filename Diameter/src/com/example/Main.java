package com.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        final double pi=3.14;
	    double diameter,radius;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter diameter:");
        diameter=scanner.nextDouble();
        System.out.println("radius is equal to: "+diameter/2);
        radius=diameter/2;
        System.out.println("The perimeter is : "+df.format(2*pi*radius));

    }
}
