package com.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int input;
    Scanner scanner=new Scanner(System.in);
	input=scanner.nextInt();

	String string=input==1?"Hello":"Bye";

	System.out.println(string);
    }
}
