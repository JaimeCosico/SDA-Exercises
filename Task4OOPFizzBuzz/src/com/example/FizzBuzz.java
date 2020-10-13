package com.example;

public class FizzBuzz {
    private int inputNum;

    public void setNumber(int intNumber) {
        this.inputNum = intNumber;
    }

    public boolean verifyPositiveNum() {
        if(inputNum<0){
            return false;
        }else{
            return true;
        }
    }

    public void printFizzBuzzNumbers(){
        for(int counter=1;counter<=inputNum;counter++){
            if(counter%3==0&&counter%7==0){
                System.out.println("Fizz Buzz");
            }else if(counter%3==0){
                System.out.println("Fizz");
            }else if(counter%7==0){
                System.out.println("Buzz");
            }else{
                System.out.println(+counter);
            }
        }
    }
}
