package com.example;

public class Main {

    public static void main(String[] args) {
        //We can pass multiple types of fields if we declare an object Array.
        Poem[] poemsArray= new Poem[3];

        //Create an instance of the author class
        Author author1= new Author();
        Author author2= new Author();
        Author author3= new Author();

        //Set the values of the author1,author2,author3 instances.
        author1.setSurname("Poe");
        author1.setNationality("American");

        author2.setSurname("Frost");
        author2.setNationality("American");

        author3.setSurname("Shakespeare");
        author3.setNationality("English");

        //Sets the values of the Poem
        Poem poem1 = new Poem(author1,5);
        Poem poem2 = new Poem(author2,10);
        Poem poem3 = new Poem(author3,20);

        poemsArray[0]=poem1;
        poemsArray[1]=poem2;
        poemsArray[2]=poem3;

        Poem longestPoem=getLongestPoem(poemsArray);

        System.out.println(longestPoem.getAuthor().getSurname()+" is a/an "+longestPoem.getAuthor().getNationality());
    }
    public static Poem getLongestPoem(Poem[] _poemsArray){
        int higherStrophe=0;
        Poem longestPoem= new Poem();

        for(int index=0;index< _poemsArray.length;index++){
            if(_poemsArray[index].getStropheNumbers()>higherStrophe){
                higherStrophe=_poemsArray[index].getStropheNumbers();
                longestPoem=_poemsArray[index];
            }
        }
        return longestPoem;
    }
 }

