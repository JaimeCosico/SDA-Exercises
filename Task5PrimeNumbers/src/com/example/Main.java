package com.example;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int inputNumber,currentNumber,factorNum=0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Prime Number Verifier");
		System.out.println("Please enter a positive Number: ");
		inputNumber = scanner.nextInt();

		System.out.println("The prime numbers up to "+inputNumber+":");
		for (int primeNumbers=2;primeNumbers<inputNumber;primeNumbers++) {
			currentNumber=primeNumbers;
			for(int counter=inputNumber;counter>=1;counter--){
				if(currentNumber%counter==0){
					factorNum++;
				}
			}
			if(factorNum<=2){
				System.out.println(+currentNumber);
				factorNum=0;
			}else{
				factorNum=0;
			}
		}
	}
}