package com.example;

public class Main {

    static String Border=  "################################################";
    static String SideBorder= "#";
    static String Name=       "Jaime Daniel";
    static String Address1=   "Block 21 L15-E15 Molave Street Ceris I LEDC";
    static String Address2=   "Canlubang, Calamba City, 4028";

    public static void main(String[] args) {
        System.out.println(Border);
        System.out.println(SideBorder+"                                              "+SideBorder);
        System.out.println(SideBorder+"             "+Name+"                     "+SideBorder);
        System.out.println(SideBorder+" "+Address1+"  "+SideBorder);
        System.out.println(SideBorder+"        "+Address2+"         "+SideBorder);
        System.out.println(SideBorder+"                                              "+SideBorder);
        System.out.println(Border);
    }
}
