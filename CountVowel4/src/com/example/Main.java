package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String input ="";
	    String lowerCaseInput="";
	    String[] vowels = new String[]{"a","e","i","o","u"};
		int count=0;

	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter a word");
	    input = scanner.nextLine();
	    lowerCaseInput=input.toLowerCase();

	    for(int x=0;x<lowerCaseInput.length();x++){
	    	String letter=String.valueOf(lowerCaseInput.charAt(x));
	    	for(int y=0;y<vowels.length;y++) {
				if (letter.equals(vowels[y])) {
					count++;
				}
			}
		}
		System.out.println("Vowels:"+count);
    }
}
