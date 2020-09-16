package com.example;

public class Main {

    public static void main(String[] args) {

        for(int i=1;i<6;i++) {
            for (int b =0; b < i; b++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=6;i>1;i--) {
            for (int b =0; b < i; b++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
