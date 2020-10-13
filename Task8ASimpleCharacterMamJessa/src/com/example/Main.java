package com.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    float firstNumber;
	    String operation;
	    float secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my Simple Calculator");
        System.out.println("Please enter first number: ");
        firstNumber= scanner.nextFloat();
        System.out.print("Please select operation: \n (+) Addition \n (-) Subtraction \n (*) Multiplication \n (/) Division \n\n Operation Selected: ");
        operation=scanner.next();
        System.out.println("Please enter second number: ");
        secondNumber=scanner.nextFloat();

        if(operation.equals("+")){
            System.out.println("The Sum is: "+(firstNumber+secondNumber));
        }else if(operation.equals("-")){
            System.out.println("The Difference is: "+(firstNumber-secondNumber));
        }else if(operation.equals("*")){
            System.out.println("The Product is: "+(firstNumber*secondNumber));
        }else if(operation.equals("/")){
            if(secondNumber==0){
                System.out.println("Quotient is undefined");
            }else{
                System.out.println("The Quotient is: "+(firstNumber/secondNumber));
            }
        }else{
            System.out.println("Invalid Symbol");
        }
    }
}
