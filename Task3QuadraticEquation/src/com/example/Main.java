package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int a,b,c,x1,x2,delta;
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Welcome to quadratic equation calculator");
        System.out.println("Please enter the value of a:");
        a=scanner.nextInt();
        System.out.println("Please enter the value of b:");
        b=scanner.nextInt();
        System.out.println("Please enter the value of c:");
        c=scanner.nextInt();

        System.out.println("The value of a: "+a);
        System.out.println("The value of b: "+b);
        System.out.println("The value of c: "+c);

        delta=(int)Math.pow(b,2)-(4*a*c);
        System.out.println("The value of delta is: "+delta);


        if(delta<0){
            System.out.println("Delta is negative");
            return;
        }else{
            x1=(-b-(int)Math.sqrt(delta))/(2*a);
            System.out.println("The value of x1 is: "+x1);
            x2=(-b+(int)Math.sqrt(delta))/(2*a);
            System.out.println("The value of x2 is: "+x2);
        }

    }
}
