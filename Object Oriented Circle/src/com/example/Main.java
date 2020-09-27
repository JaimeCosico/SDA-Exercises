package com.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Circle myCircle=new Circle();
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Diameter:");
        double inputDiameter = scanner.nextDouble();
        myCircle.setDiameter(inputDiameter);
        double perimeter=myCircle.computePerimeter();
        System.out.println("The perimeter of the circle is:"+df.format(perimeter));
    }
}
