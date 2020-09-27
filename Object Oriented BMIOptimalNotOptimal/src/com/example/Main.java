package com.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("#.##");
       BMI myBMI=new BMI();
       Scanner scanner = new Scanner(System.in);
	   System.out.println("Welcome to BMI Calculator");
	   System.out.println("Please enter your weight in kilograms: ");
	   myBMI.setWeight(scanner.nextFloat());
	   System.out.println("Please enter your height in centimeters: ");
	   myBMI.setHeight(scanner.nextInt());
	   myBMI.convertHeightCmToMeterSq();
	   double BMI=myBMI.computeBMI();
       boolean isOptimal= myBMI.checkBMI();
       if(isOptimal){
           System.out.println("Your BMI: "+df.format(BMI)+" is Optimal");
       }else{
           System.out.println("Your BMI: "+df.format(BMI)+" is Not Optimal");
       }
    }
}
