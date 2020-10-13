package com.example;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int numberToGuess, numberInput;
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        boolean isGameInProgress=true;

        System.out.println("Welcome to the game of too much and too little!");
        System.out.println("Computer is thinking of a number....");

        numberToGuess = ran.nextInt(100);
        System.out.println(+numberToGuess);

        System.out.println("Can you guess the number?");
        do{
            System.out.print("Type the number here: ");
            numberInput = scanner.nextInt();

            if (numberToGuess < numberInput) {
            System.out.println("Number is: Too much");
            } else if (numberToGuess > numberInput) {
                System.out.println("Number is: Not enough");
            } else if (numberToGuess == numberInput) {
                System.out.println("Congratulations!");
                isGameInProgress=false;
            }
        }while (isGameInProgress);
    }
}
