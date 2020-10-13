package com.example;

public class Main {

    public static void main(String[] args) {
        String[][] myArray = new String[2][];

        myArray[0] =new String[]{"R0_C0","R0_C1","R0_C2","R0_C3"};
        myArray[1] =new String[]{"R1_C0","R1_C1","R1_C2","R1_C3"};

        System.out.println(myArray[0][0]);
        System.out.println(myArray[0][2]);
        System.out.println(myArray[1][1]);
        System.out.println(myArray[1][3]);

        for(int i=0;i<=myArray.length-1;i++){
            for(int j=0;j<=myArray[i].length-1;j++){
                System.out.print("Row: "+i+" "+myArray[i][j]+" ");
            }
            System.out.println();
        }

        //System.out.println(myArray[1][4]); //- will throw the arrayindeoutofbounds

    }
}
