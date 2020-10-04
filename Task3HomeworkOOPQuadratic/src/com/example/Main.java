package com.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a,b,c;
        float resultX1,resultX2;
        boolean isDeltaNeg;

		Scanner scanner = new Scanner(System.in);
		QuadraticEquation MyQE= new QuadraticEquation();

	    System.out.println("Welcome to Quadratic Equations Calculator");
	    System.out.println("Please enter value of a: ");
	    MyQE.setIntegerA(scanner.nextInt());
        System.out.println("Please enter value of b: ");
        MyQE.setIntegerB(scanner.nextInt());
        System.out.println("Please enter value of c: ");
        MyQE.setIntegerC(scanner.nextInt());

        MyQE.computeDelta();
        isDeltaNeg=MyQE.verifyIsDeltaNegative();
        System.out.println("Delta's value is: "+(MyQE.getDelta()));

        MyQE.computeX1();
        MyQE.computeX2();
        System.out.println("Computing for X1 and X2...");

        resultX1=MyQE.getX1();
        resultX2=MyQE.getX2();

        if(isDeltaNeg){
            System.out.println("Delta is Negative closing application...");
        }else{
            System.out.println("The value of X1 is: "+resultX1);
            System.out.println("The value of X2 is: "+resultX2);
        }
    }
}
