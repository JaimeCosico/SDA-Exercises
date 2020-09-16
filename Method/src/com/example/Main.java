package com.example;

public class Main {

    //value is user defined variable

    public static void main(String[] args) {

        printHelloWorld("HelloWorld");
        printHelloWorld("HelloPhilippines");
        returnExample(1);
        returnExample(2);
        int multipleValue = multiple(23,2,5); //230
        System.out.println(multipleValue);
    }

    //not returning a value
    static void printHelloWorld(String value){
        System.out.println(value);
    }

    //early interruption of a method
    static void returnExample(int number){
        if((number%2)==0){
            return;
        }
        System.out.println(number);
    }
    //return example of a value
    static int multiple(int arg1, int arg2, int arg3){
        return arg1 * arg2 * arg3;
    }
}

