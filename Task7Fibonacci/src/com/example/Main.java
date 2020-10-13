package com.example;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {


    public static void main(String[] args) {
	    int userInput,fibonacciNumber;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat commaFormat = new DecimalFormat();
        commaFormat.setGroupingUsed(true);
        commaFormat.setGroupingSize(3);

        System.out.println("Welcome to Fibonacci Program Generator!");
        System.out.println("Enter the index of Fibonacci number: ");

        userInput=scanner.nextInt();

        System.out.println("Printing list of Fibonacci numbers up to the index...");

        fibonacciNumber=getFibonacci(userInput);

        System.out.print("\nThe Fibonacci number in index"+" ["+userInput+"] "+ " is: "+commaFormat.format(fibonacciNumber));
    }
    public static int getFibonacci(int _fibonacciIndexInput){
        DecimalFormat commaFormat = new DecimalFormat();
        commaFormat.setGroupingUsed(true);
        commaFormat.setGroupingSize(3);

        int fibonacciNumber=1,currentNumber=0,nextNumber=1;

        System.out.print("["+fibonacciNumber+"] ");

        for(int fibIndex=1;fibIndex<_fibonacciIndexInput;fibIndex++ ){

            fibonacciNumber=currentNumber+nextNumber;

           currentNumber=nextNumber;

           nextNumber=fibonacciNumber;

           System.out.print("["+commaFormat.format(fibonacciNumber)+"] ");
        }
        return fibonacciNumber;
    }
}

