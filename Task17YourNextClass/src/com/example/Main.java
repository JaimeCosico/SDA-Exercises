package com.example;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
	    LocalDate now = LocalDate.now();
	    String classSchedule;
        Pattern pattern = Pattern.compile("[0-9]{4}[-][0-9]{2}[-][0-9]{2}");
        boolean isInputValid;

	    Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Your Next SDA Class!");
	    System.out.println("Please enter the date of your class.");
	    System.out.print("yyyy-mm-dd: ");
	    classSchedule=scanner.nextLine();
        Matcher matcher = pattern.matcher(classSchedule);
        isInputValid=matcher.matches();

        if(isInputValid){
            LocalDate dateClassSchedule = LocalDate.parse(classSchedule);
            System.out.println("Your class date is: "+classSchedule);
            System.out.println("The date today is: "+now);
            System.out.println("You have "+ ChronoUnit.DAYS.between(now,dateClassSchedule)+" day/s before your next class");
        }else{
            System.out.println("You entered an invalid date!");
        }
    }
}
