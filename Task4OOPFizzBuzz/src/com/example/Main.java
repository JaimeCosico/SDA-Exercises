package com.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int inputNumber;
        boolean isPositive=true;
	    Scanner scanner = new Scanner(System.in);
	    FizzBuzz MyFizzBuzz = new FizzBuzz();

	    System.out.println("Welcome to Fuzz Buzz Program");
        System.out.println("Please enter a positive number: ");

        MyFizzBuzz.setNumber(scanner.nextInt());
        if(isPositive){
            MyFizzBuzz.printFizzBuzzNumbers();
        }else{
            System.out.println("You entered an invalid number");
        }
    }
}
