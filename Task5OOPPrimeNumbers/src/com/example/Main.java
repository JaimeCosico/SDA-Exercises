package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int inputNumber,PrimeNumber;
	    Scanner scanner=new Scanner(System.in);
        PrimeNumbers MyPrimeNumbers = new PrimeNumbers();

        System.out.println("Welcome to Prime Number Verifier");
        System.out.println("Please enter a positive Number: ");
        MyPrimeNumbers.checkIfPrimeNumber(inputNumber = scanner.nextInt());

        System.out.println("The prime numbers up to "+inputNumber+":");
        for(int currentNumber=1;currentNumber<=inputNumber;currentNumber++){
            MyPrimeNumbers.checkIfPrimeNumber(currentNumber);
        }

    }
}
