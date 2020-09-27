package com.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

    	String patternText="(http)";
	    String userInput;

	    Pattern pattern = Pattern.compile(patternText);
	    System.out.println("Please enter text: ");
	    Scanner scanner= new Scanner(System.in);
	    userInput=scanner.next();
	    System.out.println("userInput");


	    Matcher matcher = pattern.matcher(userInput);

	    boolean isMatched = matcher.matches();

	    if(isMatched){
	        System.out.println("Correct");
        }else {
	        System.out.println("Invalid Format");
        }

    }
}
