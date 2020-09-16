package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String word;
	    System.out.println("Enter a word: ");
	    Scanner scanner=new Scanner(System.in);
	    word= scanner.next();
	    System.out.println("The word that you entered is: "+word);
	    int vowelCount=vowelCounter(word);
	    System.out.println("There are: "+vowelCount+" vowels in the word "+word);
    }

    public static int vowelCounter(String word){
        String vowels[]={"a","e","i","o","u"};
        int numOfVowels=0;
        for(int i=0;i<word.length();i++){
            for(int j=0;j<vowels.length;j++){
                if(vowels[j].equalsIgnoreCase(Character.toString(word.charAt(i)))){
                    System.out.println("Vowels found: "+vowels[j]);
                    numOfVowels++;
                }
            }
        }
        return numOfVowels;
    }
}
