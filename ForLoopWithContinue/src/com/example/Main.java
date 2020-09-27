package com.example;

public class Main {

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i==8&&i==10){
                System.out.println("Continue found!");
                continue;
            }
            System.out.println("Hello World "+i);
        }
    }
}
