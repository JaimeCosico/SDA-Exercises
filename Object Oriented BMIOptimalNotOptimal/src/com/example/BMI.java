package com.example;

public class BMI {
    private double weight,BMI,mHeightSq,mHeight;
    private int height;
    private boolean isOptimal;

    public void setWeight(float _weight){
        this.weight=_weight;
    }

    public void setHeight(int _height){
        this.height=_height;
    }

    public void convertHeightCmToMeterSq(){
        mHeight=(double)height/100;
        mHeightSq=mHeight*mHeight;
    }

    public double computeBMI(){
        BMI=weight/mHeightSq;
        return BMI;
    }

    public boolean checkBMI(){
        if(BMI>=18.5 && BMI<=24.9){
            isOptimal=true;
        }else{
            isOptimal=false;
        }
        return isOptimal;
    }
}
