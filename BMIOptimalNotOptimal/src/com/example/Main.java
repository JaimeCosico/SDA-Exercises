package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    float weight,bmi; //kilograms
        int height,meterHeightSq; //centimeter


        System.out.println("Welcome to BMI Calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your weight in (kilograms kg):" );
        weight=scanner.nextFloat();
        System.out.println("Please input your height in (centimeters cm):");
        height=scanner.nextInt();
        System.out.println("Your weight is:"+weight);
        System.out.println("Your height is:"+height);

        meterHeightSq=(height/100)*(height/100);
        System.out.println("Your height in meters is: "+meterHeightSq);
        bmi=weight/meterHeightSq;
        System.out.println("Your BMI: is: "+bmi);
        if(bmi>=18.5 && bmi<=24.9){
            System.out.println("BMI Optimal");
        }else{
            System.out.println("BMI not optimal");
        }
    }
}
