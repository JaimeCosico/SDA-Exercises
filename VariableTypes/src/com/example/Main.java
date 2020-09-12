package com.example;
import java.util.Scanner;

public class Main {
    static int x,y,z;
    static int sum=0;
    static int difference=0;
    static int firstNumber = 10;
    static int secondNumber = 10;
    static char characterValue ='u';
    static boolean  isChecked = true;
    static int quotient=0;
    static int product=0;
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
        product=firstNumber*secondNumber;
        quotient=firstNumber/secondNumber;
        if(secondNumber==0){
            System.out.println("Divisor is zero!");
        }else if(secondNumber!=0){
            System.out.println("The quotient is: "+quotient);
        }
        System.out.println("The product is: "+product);

        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter your first Name:");
        String fullName = scanner.nextLine();
        System.out.println("My name is"+fullName);

        x=5;
        x*=5;
        System.out.println(x);

        System.out.println(firstNumber>=secondNumber); //you can use relational operators to get a true or false value.


    }
}
