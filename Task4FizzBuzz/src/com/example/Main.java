package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int numberInput;
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Welcome to Fizz Buzz program");
        System.out.println("Please enter a positive number: ");
	    numberInput=scanner.nextInt();
        System.out.println("The number that you input is: "+numberInput);
        System.out.println("Printing numbers up to "+numberInput+":");
        for(int counter=1;counter<=numberInput;counter++){
            if(counter%3==0 && counter%7==0){
                System.out.println("Fizz Buzz");
            }else if(counter%3==0){
                System.out.println("Fizz");
            }else if(counter%7==0){
                System.out.println("Buzz");
            }
            else
                System.out.println(+counter);
        }
    }
}
