package com.example;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	DecimalFormat dfTwo =new DecimalFormat("#.##");
	DecimalFormat dfWhole =new DecimalFormat("#");
	int nValue;

	System.out.println("Welcome to the Harmonic Series Calculator!");
	System.out.print("Enter value of n: ");
	nValue=scanner.nextInt();

	double harmonicSeriesValue=1.0;
	System.out.print("Harmonic Series formula is: 1");
	    for(double index=2;index<=nValue;index++){
	        harmonicSeriesValue=harmonicSeriesValue+1/index;
            System.out.print("+ 1/"+dfWhole.format(index)+" ");
	    }
    	System.out.println(":");
	    System.out.print("The answer is: "+dfTwo.format(harmonicSeriesValue)+".");
    }
}

