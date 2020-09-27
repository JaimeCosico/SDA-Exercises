package com.example;

public class Main {

    public static void main(String[] args) {

        int[] sample=new int[5];
        displayParameters("String ko",1,2,3,4,5,6,7,8,9,0);
    }

    static void displayParameters(String value,int... params){
        value.length();
        for(int x=0;x<params.length;x++){
            System.out.println(value+params[x]);
        }
    }
}
