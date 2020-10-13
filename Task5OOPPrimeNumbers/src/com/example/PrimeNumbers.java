package com.example;

public class PrimeNumbers {
    private int inputNumber;
    private boolean isPrimeNumber;

    public int setInputNumber(int _inputNumber){
        this.inputNumber=_inputNumber;
        return inputNumber;
    }

    public void checkIfPrimeNumber(int _currentNumber){
        int currentNumber=_currentNumber,factorNum=0;

        for(int counter=inputNumber;counter>=1;counter--){
            if(currentNumber%counter==0){
                factorNum++;
            }
        }
        if(factorNum<=2){
            isPrimeNumber=true;
        }else{
            isPrimeNumber=false;
        }
    }

    public boolean getIsPrimeNumber(){
        return isPrimeNumber;
    }
}
