package com.example;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
	    LocalTime localTime=LocalTime.now();
	    System.out.println("Now is the time: "+localTime);

	    for(int i=0;i<58;i++){
            System.out.println("Now is the time: "+localTime);
        }

    }
}
