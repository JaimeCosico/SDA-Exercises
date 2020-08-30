package com.example;
import java.util.Scanner;

public class Main {

    static int sum=0;
    static int difference=0;
    static int firstNumber = 10;
    static int secondNumber = 10;
    static char characterValue ='u';
    static boolean  isChecked = true;
    static String fullName = "";
    public static void main(String[] args) {
	    sum=firstNumber+secondNumber;
	    System.out.println("Sum is equal to "+sum);
    /* Subtract 2 numbers then display difference */
        difference=firstNumber-secondNumber;
        System.out.println("Difference is equal to "+difference);

        if(isChecked){
            System.out.println("One");
        }



        if(difference==0){
            System.out.println("Zero!!!");


        }

        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter your first Name:");
        String fullName = scanner.nextLine();
        System.out.println("My name is"+fullName);
    }
}
