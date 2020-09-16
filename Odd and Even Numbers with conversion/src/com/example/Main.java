package com.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double numberD;

        System.out.print("Input a number: ");
        Scanner scanner=new Scanner(System.in);
        numberD=scanner.nextDouble();

        int numberInt=(int)numberD;

        if(numberD!=Math.abs(numberD)||numberD%1!=0) {
            System.out.println(numberInt+" is either a negative or a decimal number");
        }else{
            if(numberD%2==0){
                System.out.println(numberInt+" is an even number");
            }else
                System.out.println(numberInt+" is an odd number");
        }
    }
}
