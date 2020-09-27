package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Please enter a word: ");
	    String word= scanner.next();
        word=word.toLowerCase();
        System.out.println("The word is: "+word);
        int vowelNum=vowelCounter(word);
        System.out.println("There are "+vowelNum+" vowels in this word: "+word);
    }



    public static int vowelCounter(String wordToCount){
        String vowels="aeiou";
        String wordLetter;
        int vowelCounter=0;

        for(int i=0;i<wordToCount.length();i++){
            for(int j=0;j<wordToCount.length();j++){
                wordLetter=wordToCount.substring(i,i+1);
                if(wordLetter.equals(vowels.substring(j,j+1))){
                    System.out.println(wordLetter=vowels.substring(j,j+1));
                    vowelCounter++;
                }
            }
        }
        return vowelCounter;
    }
}
