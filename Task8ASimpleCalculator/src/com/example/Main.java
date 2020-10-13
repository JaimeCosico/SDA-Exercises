package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    float firstNumber,secondNumber,answer;
	    String validOperations="+-*/";
	    char operationUsed;
        boolean isOperationValid=true;
	    Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to Simple Calculator:");
        System.out.println();
	    System.out.println("Please enter first number: ");
        firstNumber =scanner.nextFloat();
        System.out.print("Please select Operation: \n + (Addition)\n - (Subtraction)\n * (Multiplication)\n / (division)\n");
        operationUsed = scanner.next().charAt(0);
        System.out.println("Please enter second number: ");
        secondNumber=scanner.nextFloat();

        for(int validOperationIndex=0;validOperationIndex<=3;validOperationIndex++){
            if(validOperations.charAt(validOperationIndex)==operationUsed){
                isOperationValid=true;
                break;
            }else{
                isOperationValid=false;
            }
        }

        if(isOperationValid){
            switch (operationUsed){
                case ('+'):{
                    System.out.println("Addition operation");
                    answer=firstNumber+secondNumber;
                    System.out.println("The sum is: "+answer);
                    break;
                }
                case ('-'):{
                    System.out.println("Subtraction operation");
                    answer=firstNumber-secondNumber;
                    System.out.println("The difference is: "+answer);
                    break;
                }
                case ('*'):{
                    System.out.println("Multiplication operation");
                    answer=firstNumber*secondNumber;
                    System.out.println("The product is: "+answer);
                    break;
                }
                case ('/'):{
                    System.out.println("Division operation");
                    if(secondNumber==0){
                        System.out.println("The quotient is undefined.");

                    }
                    else{
                        answer=firstNumber/secondNumber;
                        System.out.println("The quotient is: "+answer);

                    }
                    break;
                }
            }
        }else{
            System.out.println("Cannot Calculate");
        }
    }
}
