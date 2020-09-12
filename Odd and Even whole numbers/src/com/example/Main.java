package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        System.out.print("Input a number: ");
        Scanner scanner=new Scanner(System.in);

        try {
            number=scanner.nextInt();
            if (number%2>=1) {
                System.out.println("The number is an odd number");
            } else if (number%2==0) {
                System.out.println("The number is an even number");
            } else {
                System.out.println("Invalid number!");
            }
        }catch(InputMismatchException e){
            System.out.println("Invalid number!");
        }
    }
}
