package com.example;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int firstNumber, secondNumber, choice;

		Scanner scanner = new Scanner(System.in);

		System.out.println("1-Addition" + "\n" + "2-Subtraction" + "\n" + "3-Multiplication" + "\n" + "4-Division" + "\n" + "Input number: ");
		choice = scanner.nextInt();

		if (choice < 1 || choice > 4) {
			System.out.println("Invalid choice!");
		} else {
			System.out.println("Enter First Number: ");
			firstNumber = scanner.nextInt();
			System.out.println("Enter Second Number: ");
			secondNumber = scanner.nextInt();

			switch (choice) {
				case 1: {
					System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is :" + (firstNumber + secondNumber));
					break;
				}
				case 2: {
					System.out.println("The difference of " + firstNumber + " and " + secondNumber + " is :" + (firstNumber - secondNumber));
					break;
				}
				case 3: {
					System.out.println("The product of " + firstNumber + " and " + secondNumber + " is :" + (firstNumber * secondNumber));
					break;
				}
				case 4: {
					if (secondNumber == 0) {
						System.out.println("Second number is invalid!");
						break;
					} else
						System.out.println("The quotient of " + firstNumber + " and " + secondNumber + " is :" + (firstNumber / secondNumber) + "r" + (firstNumber % secondNumber));
					break;
				}
				default:
					System.out.println("Invalid choice!");
					break;
			}
		}
	}
}
    	/*int choice=0;
    	int firstNumber=0;
		int secondNumber=0;
		int answerNumber=0;
		int remainder=0;
    	System.out.println("1-Addition");
		System.out.println("2-Subtraction");
		System.out.println("3-Multiplication");
		System.out.println("4-Division");
		Scanner scanner= new Scanner(System.in);
		System.out.print("Input number: ");
		choice= scanner.nextInt();


		switch(choice){

			case 1: {
				System.out.print("Input First number: ");
				firstNumber=scanner.nextInt();
				System.out.print("Input Second number: ");
				secondNumber=scanner.nextInt();
				answerNumber=firstNumber+secondNumber;
				System.out.println("The sum is: "+answerNumber);
				break;
			}
			case 2: {
				System.out.print("Input First number: ");
				firstNumber=scanner.nextInt();
				System.out.print("Input Second number: ");
				secondNumber=scanner.nextInt();
				answerNumber=firstNumber-secondNumber;
				System.out.println("The difference is: "+answerNumber);
				break;
			}
			case 3: {
				System.out.print("Input First number: ");
				firstNumber=scanner.nextInt();
				System.out.print("Input Second number: ");
				secondNumber=scanner.nextInt();
				answerNumber=firstNumber*secondNumber;
				System.out.println("The product is: "+answerNumber);
				break;
			}
			case 4: {
				System.out.print("Input First number: ");
				firstNumber = scanner.nextInt();
				System.out.print("Input Second number: ");
				secondNumber = scanner.nextInt();
				answerNumber = firstNumber / secondNumber;
				remainder = firstNumber % secondNumber;
				if (secondNumber == 0) {
					System.out.println("Divisor should not be =0: Undefined");
					break;
				} else {
					System.out.println("The quotient is: " + answerNumber + " remainder :" + remainder);
					break;
				}
			}
			default:
				System.out.println("Invalid number!");
				break;
		}*/



