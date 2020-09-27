package com.example;

public class Main {

    public static void main(String[] args) {


        // will not execute once if it false.
        int i=0;

        while(i>10){
            System.out.println("Hello World While");
            ++i;
        }


        //will execute once if it false
        do{
            System.out.println("Hello World Do");
            ++i;
        }while(i>10);

    }
}
