package com.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumOfAsterisk;

        System.out.println("Welcome to the Wave Creator Program!");
        System.out.println("Please enter number of *: ");

        inputNumOfAsterisk = scanner.nextInt();

        System.out.println("Printing the wave lines...:\n");

        printLinePattern(0,0,0,0,inputNumOfAsterisk); // Topmost Line pattern
        printLinePattern(1,-1,1,-1,inputNumOfAsterisk);//Second Line Pattern
        printLinePattern(2,-2,2,-2,inputNumOfAsterisk);//Third Line Pattern
        printLinePattern(3,-3,3,-3,inputNumOfAsterisk);//Fourth line Pattern

    }

    public static void printLinePattern(int _p1BAdjust,int _p1EAdjust,int _p2BAdjust,int _p2EAdjust,int _inputNumOfAsterisk){
        int pointer1Begin=1+_p1BAdjust;
        int pointer1End=8+_p1EAdjust;
        int pointer2Begin=9+_p2BAdjust;
        int pointer2End=15+_p2EAdjust;

        for(int asteriskCount=1;asteriskCount<=_inputNumOfAsterisk;asteriskCount++){
            if(asteriskCount==pointer1Begin) {
                printAsterisk();
                pointer1Begin+=15;
            }else if(asteriskCount==pointer1End){
                printAsterisk();
                pointer1End+=15;
            }else if(asteriskCount==pointer2Begin){
                printAsterisk();
                pointer2Begin+=15;
            }else if(asteriskCount==pointer2End){
                printAsterisk();
                pointer2End+=15;
            }
            else{
                printSpaces();
            }
        }
        nextLine();
    }

    public static void printAsterisk(){
        System.out.print("*");
    }
    public static void printSpaces(){
        System.out.print(" ");
    }
    public static void nextLine(){
        System.out.println();
    }
}