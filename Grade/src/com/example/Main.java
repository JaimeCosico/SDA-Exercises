package com.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int grade1=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a grade: ");
        grade1 = scanner.nextInt();
        if (grade1>=86&&grade1<100) {
            System.out.println(": Very Good!");
        }else if(grade1>=75&&grade1<86){
            System.out.println(": Good!");
        }else if(grade1<75){
            System.out.println(": Failed");
        }else
            System.out.println("Invalid grade!");
    }
}
