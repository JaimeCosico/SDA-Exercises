package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\nChoose a number for operation: ");
        int userInput=scanner.nextInt();
        System.out.println("Input First Number: ");
        int firstNumberUI=scanner.nextInt();
        System.out.println("Input Second number: ");
        int secondNumberUI=scanner.nextInt();

        switch(userInput) {
            case 1: {
                int answer = additionOperation(firstNumberUI, secondNumberUI);
                System.out.println("The sum of " + firstNumberUI + " and " + secondNumberUI + " is " + answer);
                break;
            }
            case 2: {
                   int answer = subtractionOperation(firstNumberUI, secondNumberUI);
                   System.out.println("The difference of " + firstNumberUI + " and " + secondNumberUI + " is " + answer);
                   break;
            }
            case 3: {
                int answer = multiplicationOperation(firstNumberUI, secondNumberUI);
                System.out.println("The product of " + firstNumberUI + " and " + secondNumberUI + " is " + answer);
                break;
            }
            case 4: {
                int answer = quotientOperation(firstNumberUI, secondNumberUI);
                int remainder = remainderOperation(firstNumberUI, secondNumberUI);
                System.out.println("The quotient of " + firstNumberUI + " and " + secondNumberUI + " is " + answer + " r " + remainder);
                break;
            }
            default: {
                System.out.println("Invalid Number!");
                break;
            }
        }
    }
       public static int additionOperation(int firstNumber,int secondNumber){
         return firstNumber + secondNumber;
    }

    public static int subtractionOperation(int firstNumber,int secondNumber){
        return firstNumber - secondNumber;
    }

    public static int multiplicationOperation(int firstNumber,int secondNumber){
        return firstNumber * secondNumber;
    }

    public static int quotientOperation(int firstNumber,int secondNumber){
        return firstNumber / secondNumber;
    }
    public static int remainderOperation(int firstNumber,int secondNumber){
        return firstNumber % secondNumber;
    }
}


