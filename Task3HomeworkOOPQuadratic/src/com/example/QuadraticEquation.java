package com.example;

public class QuadraticEquation {
    private int a,b,c,x1,x2,delta;
    private boolean isDeltaNegative;

    public void setIntegerA(int _varA){

        this.a=_varA;
    }
    public void setIntegerB(int _varB){

        this.b=_varB;
    }
    public void setIntegerC(int _varC){

        this.c=_varC;
    }

    public void computeDelta(){
        delta=(int)Math.pow(b,2)-(4*a*c);
    }

    public boolean verifyIsDeltaNegative(){
        if(delta<0){
            isDeltaNegative=true;
        }else{
            isDeltaNegative=false;
        }
        return isDeltaNegative;
    }

    public void computeX1(){
        x1=((-b)-((int)Math.sqrt(delta)))/(2*a);
    }

    public void computeX2(){
        x2=((-b)+((int)Math.sqrt(delta)))/(2*a);
    }

    public float getX1(){
        return x1;
    }

    public float getX2(){
        return x2;
    }

    public int getDelta(){
        return delta;
    }


}
