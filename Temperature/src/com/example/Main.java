package com.example;

public class Main {

    public static void main(String[] args) {
        float temperature = 36.7f;
        int c=0;

        if (temperature >= 37.0f) {
            System.out.println("You have a fever");
        } else if (temperature >= 36.6f && temperature < 37.0f) {
            System.out.println("You are healthy");
        }else
            System.out.println("You are normal");
            System.out.print(c);
    }
}
